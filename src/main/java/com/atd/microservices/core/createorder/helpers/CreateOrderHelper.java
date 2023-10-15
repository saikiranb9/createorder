package com.atd.microservices.core.createorder.helpers;

import brave.Tracer;
import com.atd.domain.microservices.customerlocation.SiteUse;
import com.atd.domain.microservices.ediconfig.EdiConfig;
import com.atd.domain.microservices.product.Catalog;
import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.domains.CreateOrder;
import com.atd.microservices.core.createorder.domains.ProductLine;
import com.atd.microservices.core.createorder.domains.ack.Data;
import com.atd.microservices.core.createorder.domains.ack.MetaDataAck;
import com.atd.microservices.core.createorder.domains.ack.OrderAck;
import com.atd.microservices.core.createorder.domains.ack.Product;
import com.atd.microservices.core.createorder.dto.ProductRef;
import com.atd.microservices.core.createorder.exception.NotFoundException;
import com.atd.microservices.core.createorder.external.clients.EdiConfigWebClient;
import com.atd.microservices.core.createorder.external.clients.OrderEnrichmentWebClient;
import com.atd.microservices.core.createorder.external.clients.ProcessOrderWebClient;
import com.atd.microservices.core.createorder.external.clients.ProductWebClient;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichment;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichmentResponse;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.ProductFill;
import com.atd.microservices.core.createorder.external.domains.processorderv2.MasterOrderResponse;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;
import com.atd.microservices.core.createorder.management.CreateOrderMetricsService;
import com.atd.microservices.core.createorder.mapper.OrderEnrichmentMapper;
import com.atd.microservices.core.createorder.mapper.ProcessOrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderRecord;
import reactor.util.function.Tuple2;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateOrderHelper {

	private final ApplicationProperties applicationProperties;
	private final OrderEnrichmentWebClient orderEnrichmentWebClient;
	private final KafkaSender<String, Object> kafkaSender;
	private final EdiConfigWebClient ediConfigWebClient;
	private final ProcessOrderWebClient processOrderWebClient;
	private final OrderEnrichmentMapper orderEnrichmentMapper;
	private final ProcessOrderMapper processOrderMapper;
	private final ProductWebClient productWebClient;
	private final Tracer tracer;
	private final CreateOrderMetricsService createOrderMetricsService;

	public Mono<ServerResponse> enrichAndSendAcknowledgement(String traceId, CreateOrder createOrder,
			OrderEnrichment orderEnrichment, SiteUse siteUse, List<ProductRef> productRefs) {

		if (!orderEnrichment.getProducts().isEmpty()) {
			return orderEnrichmentWebClient.enrichOrder(orderEnrichment)
					.flatMap(orderEnrichmentResponse -> processOrder(orderEnrichmentResponse)
							.zipWhen(masterOrderResponse -> prepareAcknowledgementData(createOrder, orderEnrichment,
									siteUse, orderEnrichmentResponse, traceId, productRefs))
							.zipWhen(objects1 -> kafkaSender
									.send(Mono.just(SenderRecord.create(new ProducerRecord<>(
											applicationProperties.getKafkaOrderAckTopic(), objects1.getT2()), null)))
									.next())
							.flatMap(senderResult -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
									.bodyValue(senderResult.getT1().getT2())));
		} else {
			return prepareAcknowledgementData(createOrder, orderEnrichment, siteUse, null, traceId, productRefs)
					.zipWhen(orderAck -> {
						return kafkaSender.send(Mono.just(SenderRecord.create(
								new ProducerRecord<>(applicationProperties.getKafkaOrderAckTopic(), orderAck), null)))
								.next();
					}).flatMap(orderAck -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
							.bodyValue(orderAck.getT1()));
		}
	}

	private void trackKilledProductsQty(List<Product> productList) {
		if (!CollectionUtils.isEmpty(productList)) {
			final boolean isAllKilledProducts = productList.stream().allMatch(product -> product.getFilledQty() == 0);
			if (isAllKilledProducts) {
				createOrderMetricsService.trackAllKilledProducts();
			}
		}
	}

	/**
	 * This method helps to prepare OrderEnrichment Request Object
	 * 
	 * @param createOrder - Actual Request
	 * @param objects     - Contains EdiConfig, SiteUse and Cross Reference Objects
	 * @return orderEnrichment Object
	 */
	public Mono<OrderEnrichment> mapOrderEnrichment(CreateOrder createOrder, EdiConfig ediConfig,
			Tuple2<SiteUse, List<ProductRef>> objects) {
		final SiteUse siteUse = objects.getT1();
		final List<ProductRef> crossReferences = objects.getT2();
		final List<ProductRef> productRefs = crossReferences.stream()
				.filter(productRef -> productRef.getProductNumber() != null).collect(Collectors.toList());
		return Mono.just(orderEnrichmentMapper.prepareOrderEnrichment(createOrder, ediConfig, siteUse, productRefs));
	}

	/**
	 * This method fetches EdiConfig data using Sender Code
	 * 
	 * @param createOrder - Actual Request
	 * @return EditConfig Call Mono
	 */
	public Mono<EdiConfig> getEdiConfig(CreateOrder createOrder) {
		return ediConfigWebClient.getEdiConfigForCustomer(createOrder.getSenderCode(), createOrder.getReceiverCode())
				.switchIfEmpty(Mono.error(
						new NotFoundException(String.format("Edi Config Not found. %s", createOrder.getSenderCode(),
								createOrder.getReceiverCode()), ApplicationConstants.EDIT_CONFIG)));
	}

	public Mono<EdiConfig> getEdiConfigFromRequest(ServerRequest request) {
		EdiConfig ediConfig = new EdiConfig();
		final Optional<String> customerIDOpt = request.queryParam("customerID");
		final Optional<String> fillOrKillOpt = request.queryParam("fillOrKill");
		final Optional<String> fulfillmentTypeOpt = request.queryParam("fulfillmentType");

		customerIDOpt.ifPresent(ediConfig::setCustomerID);
		fillOrKillOpt.ifPresent(ediConfig::setFillOrKill);
		fulfillmentTypeOpt.ifPresent(ediConfig::setFulfillmentType);

		return Mono.just(ediConfig);
	}

	public Mono<MasterOrderResponse> processOrder(OrderEnrichmentResponse orderEnrichmentResponse) {
		if (orderEnrichmentResponse.getHeader() != null
				&& !CollectionUtils.isEmpty(orderEnrichmentResponse.getLines())) {
			Order order = processOrderMapper.prepareOrder(orderEnrichmentResponse);
			return processOrderWebClient.processOrder(order);
		} else {
			return Mono.just(new MasterOrderResponse());
		}
	}

	/**
	 * This method is used to get trace Id if available in headers if not generate
	 * one.
	 * 
	 * @param headers - Request Headers
	 * @return traceId
	 */
	public String getTraceId(ServerRequest.Headers headers) {
		List<String> headerTraceId = headers.header("X-ATOM-MSGID");
		if (!CollectionUtils.isEmpty(headerTraceId)) {
			return headerTraceId.get(0);
		}
		headerTraceId = headers.header("X-B3-TraceId");
		if (!CollectionUtils.isEmpty(headerTraceId)) {
			return headerTraceId.get(0);
		}
		try {
			if (tracer != null) {
				if (tracer.currentSpan() == null) {
					tracer.nextSpan().start();
				}
				return tracer.currentSpan().context().traceIdString();
			}
		} catch (Exception ex) {
			log.error("Sleuth Trace Id Error: " + ex.getMessage());
		}
		return null;
	}

	/**
	 * This method build the acknowledgement data
	 * 
	 * @param createOrder - Actual Request
	 * @param response    - Enrichment Response
	 * @param traceId     - Derived Trace Id
	 * @return OrderAck - Acknowledgement Object
	 */
	private Mono<OrderAck> prepareAcknowledgementData(CreateOrder createOrder, OrderEnrichment orderEnrichment,
			SiteUse siteUse, OrderEnrichmentResponse response, String traceId, List<ProductRef> productRefs) {

		OrderAck orderAck = new OrderAck();
		MetaDataAck metaData1 = new MetaDataAck();
		List<String> finalProductLineIds = orderEnrichment.getProducts().stream()
				.map(product -> product.getCustomerPOLineId()).collect(Collectors.toList());
		Set<String> productRefSet = productRefs.stream().map(productRef -> productRef.getProductId())
				.collect(Collectors.toSet());

		metaData1.setTraceId(traceId);
		metaData1.setSenderCode(createOrder.getSenderCode());
		metaData1.setReceiverCode(createOrder.getReceiverCode());
		orderAck.setMetadata(metaData1);

		Data data = new Data();
		data.setLocationNumber(orderEnrichment.getLocationNumber());
		data.setPrimaryDCID(siteUse.getPrimaryDcId().longValue());
		if (response != null && response.getHeader() != null) {
			data.setOrigsysdocumentref(response.getHeader().getOrigsysdocumentref());
		}
		data.setCustomerPO(createOrder.getCustomerPONumber());
		AtomicReference<Long> seqNum = new AtomicReference<>(0L);
		Mono<List<Product>> productList = Flux.fromIterable(createOrder.getProducts()).flatMap(productLine -> {
			Optional<ProductFill> productFills = Optional.empty();
			if (response != null && response.getMetaData() != null && !response.getMetaData().getProducts().isEmpty()) {
				productFills = response.getMetaData().getProducts().stream().filter(
						productFill -> productFill.getCustomerPOLineId().equals(productLine.getCustomerPOLineId()))
						.findFirst();
			}
			Product product = new Product();
			product.setId(productLine.getId());
			product.setTotalReqQty(productLine.getQuantity());
			if (productFills.isPresent()) {
				product.setId(productFills.get().getProductNumber());
				product.setCustomerPOLineId(seqNum.updateAndGet(v -> v + 1));
				product.setVendorName(productFills.get().getVendorName());
				product.setFilledQty(productFills.get().getFilledQty());
				product.setKilledQty(productFills.get().getKilledQty());
				product.setAcknowledgementReasonCode(
						productFills.get().getFilledQty() == 0 ? ApplicationConstants.ITEM_UNAVAILABLE
								: ApplicationConstants.ITEM_ACCEPTED);
				return Mono.just(product);
			} else {
				product.setFilledQty(0L);
				product.setKilledQty(productLine.getQuantity());
				product.setCustomerPOLineId(seqNum.updateAndGet(v -> v + 1));
				if (!finalProductLineIds.contains(productLine.getCustomerPOLineId())) {
					product.setAcknowledgementReasonCode(
							productRefSet.contains(product.getId()) ? ApplicationConstants.ITEM_INACTIVE
									: ApplicationConstants.ITEM_INVALID);
					return Mono.just(product);
				} else {
					product.setAcknowledgementReasonCode(ApplicationConstants.ITEM_UNAVAILABLE);
					return productWebClient.findByProductNumberAndOrgID(product.getId(), siteUse.getOrgId().longValue())
							.flatMap(
									productRes -> productWebClient
											.findByInventoryItemIDAndOrgIDAndAttrName(productRes.getInventoryItemID(),
													siteUse.getOrgId().longValue(), ApplicationConstants.VENDOR_NAME)
											.single())
							.map(res -> {
								product.setVendorName(res.getAttrValue());
								return product;
							});
				}
			}
		}).collectList();

		return productList.flatMap(products -> {
			trackKilledProductsQty(products);
			data.setCount(products.size());
			data.setProducts(products);
			orderAck.setData(data);
			return Mono.just(orderAck);

		});
	}

}
