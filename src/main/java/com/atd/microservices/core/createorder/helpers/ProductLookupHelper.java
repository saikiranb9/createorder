package com.atd.microservices.core.createorder.helpers;

import com.atd.domain.microservices.customerlocation.SiteUse;
import com.atd.domain.microservices.ediconfig.EdiConfig;
import com.atd.domain.microservices.product.Catalog;
import com.atd.domain.microservices.product.ItemCrossReferences;
import com.atd.domain.microservices.product.Product;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.domains.CreateOrder;
import com.atd.microservices.core.createorder.domains.ProductLine;
import com.atd.microservices.core.createorder.dto.ProductRef;
import com.atd.microservices.core.createorder.external.clients.CatalogWebClient;
import com.atd.microservices.core.createorder.external.clients.EdiProductCrossRefWebClient;
import com.atd.microservices.core.createorder.external.clients.FndConfigWebClient;
import com.atd.microservices.core.createorder.external.clients.ProductWebClient;
import com.atd.microservices.core.createorder.external.domains.EDIProductCrossReference;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.springframework.web.util.UriUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class ProductLookupHelper {

	private final EdiProductCrossRefWebClient crossRefWebClient;
	private final ProductWebClient productWebClient;
	private final CatalogWebClient catalogWebClient;
	private final FndConfigWebClient fndConfigWebClient;

	public Mono<List<ProductRef>> productRefLookup(CreateOrder createOrder, EdiConfig ediConfig, SiteUse siteUse) {
		return Flux.fromIterable(createOrder.getProducts()).flatMap(productLine -> {
			if (Boolean.valueOf(ediConfig.getIsProductCrossReferenceEnabled())) {
				Mono<EDIProductCrossReference> ediProductCrossReferenceMono = crossRefWebClient.getProductCrossRef(
						ediConfig.getCustomerID(), productLine.getId(), encodePath(productLine.getBrand()));
				return ediProductCrossReferenceMono.hasElement().flatMap(isExist -> {
					if (isExist) {
						return ediProductCrossReferenceMono
								.flatMap(ediProductCrossReference -> enrichProductLine(productLine,
										ediProductCrossReference.getOracleNumber(), siteUse, ediConfig));
					} else {
						return verifyPacking(productLine).flatMap(isTrue -> {
							if (isTrue) {
								return enrichProductLine(productLine, productLine.getId(), siteUse, ediConfig);
							} else {
								return Mono.empty();
							}
						});
					}
				});
			} else {

				return verifyPacking(productLine).flatMap(isTrue -> {
					if (isTrue) {
						return enrichProductLine(productLine, productLine.getId(), siteUse, ediConfig);
					} else {
						return Mono.empty();
					}
				});
			}
		}).collectList();

	}

	private ProductRef prepareProductRef(Product product, ProductLine productLine) {
		return ProductRef.builder().productId(productLine.getId()).productNumber(product.getProductNumber()).build();
	}

	private ProductRef prepareProductRef(ItemCrossReferences itemCrossReferences) {
		return ProductRef.builder().productId(itemCrossReferences.getCustomerPartNumber())
				.productNumber(itemCrossReferences.getProductNo()).build();
	}

	private Mono<Boolean> verifyPacking(ProductLine productLine) {

		return fndConfigWebClient.getPackConfig()
				.filter(fndConfig -> productLine.getId().equals(fndConfig.getFlexValue())
						|| productLine.getId().equals(fndConfig.getDescription()))
				.flatMap(config -> {
					if (productLine.getQuantity() % Integer.parseInt(config.getAttribute1()) == 0) {
						productLine.setQuantity(productLine.getQuantity() / Integer.parseInt(config.getAttribute1()));
						return Mono.just(true);
					} else {
						productLine.setId(config.getDescription());
						return Mono.just(false);
					}
				}).defaultIfEmpty(true).reduce(false, (acc, res) -> acc || res);

	}

	private Mono<ProductRef> enrichProductLine(ProductLine productLine, String productNumber, SiteUse siteUse,
			EdiConfig ediConfig) {
		return productWebClient.findByProductNumberAndOrgID(productNumber, siteUse.getOrgId().longValue())
				.mapNotNull(
						product -> {
							if (product.getStatusCode().equalsIgnoreCase(ApplicationConstants.INACTIVE) ) {
								return prepareProductRef(new Product(), productLine);
							} else {
								return prepareProductRef(product, productLine);	
							}
						})
				.switchIfEmpty(productWebClient.getProductXrefForCustomer(ediConfig.getCustomerID(), productNumber)
						.onErrorResume(throwable -> Mono.empty()).mapNotNull(this::prepareProductRef)
						.switchIfEmpty(Flux.<Catalog, Catalog, Catalog>zip(
								catalogWebClient
										.findByOrgIDAndAttrNameAndAtrrValue(siteUse.getOrgId().longValue(),
												productNumber, ApplicationConstants.UPC_CODE)
										.onErrorResume(throwable -> Mono.just(new Catalog())),
								catalogWebClient
										.findByOrgIDAndAttrNameAndAtrrValue(siteUse.getOrgId().longValue(),
												productNumber, ApplicationConstants.SUPPLIER_SYS_Z)
										.onErrorResume(throwable -> Mono.just(new Catalog())),
								catalogWebClient
										.findByOrgIDAndAttrNameAndAtrrValue(siteUse.getOrgId().longValue(),
												productNumber, ApplicationConstants.MANUFACTURER_NO)
										.onErrorResume(throwable -> Mono.just(new Catalog())))
								.flatMap(objects -> {
									Long invId = null;
									objects.getT1();
									if (objects.getT1().getInventoryItemID() != null) {
										invId = objects.getT1().getInventoryItemID();
									} else if (objects.getT2().getInventoryItemID() != null) {
										invId = objects.getT2().getInventoryItemID();
									} else if (objects.getT3().getInventoryItemID() != null) {
										invId = objects.getT3().getInventoryItemID();
									}
									if (invId != null && invId > 0) {
										return productWebClient
												.findByInventoryItemIDAndOrgID(invId, siteUse.getOrgId().longValue())
												.onErrorResume(throwable -> Mono.empty())
												.filter(product -> !product.getStatusCode()
														.equalsIgnoreCase(ApplicationConstants.INACTIVE))
												.switchIfEmpty(Mono.just(new Product()))
												.map(product -> prepareProductRef(product, productLine));
									}
									return Mono.just(ProductRef.builder().build());
								}).single()));
	}

	public String encodePath(String path) {
		try {
			path = UriUtils.encodePath(path, "UTF-8");
		} catch (Exception ex) {
			throw new RuntimeException(ex.getCause());
		}
		return path;
	}
}
