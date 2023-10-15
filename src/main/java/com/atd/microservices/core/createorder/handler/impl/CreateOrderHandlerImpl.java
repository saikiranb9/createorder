package com.atd.microservices.core.createorder.handler.impl;

import com.atd.domain.microservices.customerlocation.SiteUse;
import com.atd.domain.microservices.ediconfig.EdiConfig;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.domains.CreateOrder;
import com.atd.microservices.core.createorder.exception.NotFoundException;
import com.atd.microservices.core.createorder.external.clients.CustomerLocationWebClient;
import com.atd.microservices.core.createorder.handler.CreateOrderHandler;
import com.atd.microservices.core.createorder.helpers.CreateOrderHelper;
import com.atd.microservices.core.createorder.helpers.ProductLookupHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateOrderHandlerImpl implements CreateOrderHandler {

	private final CustomerLocationWebClient customerLocationWebClient;
	private final ProductLookupHelper productLookupHelper;
	private final CreateOrderHelper createOrderHelper;

	@Override
	public Mono<ServerResponse> createOrder(final ServerRequest request) {
		final String traceId = createOrderHelper.getTraceId(request.headers());
		final Mono<CreateOrder> createOrderMono;
		createOrderMono = request.bodyToMono(CreateOrder.class);
		log.info("IN CreateOrderHandlerImpl -- Create Order Call Received -- Trace ID : {}", traceId);
		return createOrderMono.flatMap(createOrder -> createOrderHelper.getEdiConfig(createOrder)
				.flatMap(ediConfig -> getLocationSiteUse(createOrder, ediConfig)
						.zipWhen(siteUse -> productLookupHelper.productRefLookup(createOrder, ediConfig, siteUse))
						.flatMap(objects -> createOrderHelper.mapOrderEnrichment(createOrder, ediConfig, objects)
								.flatMap(orderEnrichment -> createOrderHelper.enrichAndSendAcknowledgement(traceId,
										createOrder, orderEnrichment, objects.getT1(), objects.getT2())))));
	}

	private Mono<SiteUse> getLocationSiteUse(CreateOrder createOrder, EdiConfig ediConfig) {
        if(StringUtils.isNotEmpty(ediConfig.getStoreLookUp()) && ediConfig.getStoreLookUp().equals("ATTRIBUTE4")) {
            log.info("IN CreateOrderHandlerImpl -- Before calling Location Site Use By Attribute 4 Store Number");
            return customerLocationWebClient.getLocationByAttribute4StoreNumber(ediConfig.getCustomerID(), createOrder.getStoreNumber())
            		.switchIfEmpty(customerLocationWebClient.getLocationByStoreNumber(ediConfig.getCustomerID(), createOrder.getStoreNumber()))
                    .switchIfEmpty(Flux.error(new NotFoundException(String.format("Active Customer Location Details Not found. %s, %s",
                            ediConfig.getCustomerID(), createOrder.getStoreNumber()), ApplicationConstants.CUSTOMER_LOCATION)))
                    .single();
        }
        log.info("IN CreateOrderHandlerImpl -- Before calling Location Site Use By Store Number");
        return customerLocationWebClient
                .getLocationByStoreNumber(ediConfig.getCustomerID(), createOrder.getStoreNumber())
                .switchIfEmpty(customerLocationWebClient.getLocationByAttribute4StoreNumber(ediConfig.getCustomerID(), createOrder.getStoreNumber()))
                .switchIfEmpty(Flux.error(new NotFoundException(String.format("Active Customer Location Details Not found. %s, %s",
                        ediConfig.getCustomerID(), createOrder.getStoreNumber()), ApplicationConstants.CUSTOMER_LOCATION)))
                .single();
    }

	@Override
	public Mono<ServerResponse> createOrderByLocation(final ServerRequest request) {
		final String traceId = createOrderHelper.getTraceId(request.headers());
		final Mono<CreateOrder> createOrderMono;
		createOrderMono = request.bodyToMono(CreateOrder.class);
		final String locationNumber = request.pathVariable("locationNumber");

		return createOrderMono.flatMap(createOrder -> createOrderHelper.getEdiConfigFromRequest(request)
				.flatMap(ediConfig -> customerLocationWebClient.getLocationByLocationNumber(locationNumber)
						.switchIfEmpty(Flux.error(new NotFoundException(
								String.format("Active Customer Location Details Not found by Location Number. %s",
										locationNumber),
								ApplicationConstants.CUSTOMER_LOCATION)))
						.single()
						.zipWhen(siteUse -> productLookupHelper.productRefLookup(createOrder, ediConfig, siteUse))
						.flatMap(objects -> createOrderHelper.mapOrderEnrichment(createOrder, ediConfig, objects)
								.flatMap(orderEnrichment -> createOrderHelper.enrichAndSendAcknowledgement(traceId,
										createOrder, orderEnrichment, objects.getT1(), objects.getT2())))));
	}

}
