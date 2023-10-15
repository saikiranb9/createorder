package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.domain.microservices.product.Catalog;
import com.atd.domain.microservices.product.ItemCrossReferences;
import com.atd.domain.microservices.product.Product;
import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.dto.ProductRef;
import com.atd.microservices.core.createorder.external.clients.ProductWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.net.URI;
import java.time.Duration;
import java.util.function.Function;

import static com.atd.microservices.core.createorder.external.clients.CommonClient.*;

/**
 * @author Vijay, YERRA
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class ProductWebClientImpl implements ProductWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Mono<ItemCrossReferences> getProductXrefForCustomer(String customerNumber, String customerPartNumber) {
		log.info("IN ProductWebClientImpl -- Before calling Product XRef By Customer Number and Customer Part Number : {}", customerPartNumber);
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getProductXrefUrl(), customerNumber, customerPartNumber)))
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToMono(ItemCrossReferences.class)
//				.timeout(Duration.ofMillis(TIMEOUT_1000MS))
//				.retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(RETRY_SECONDS)))
				.doOnError(throwable -> log.error("Error pulling getProductXrefForCustomer Details using URL: "
						+String.format(applicationProperties.getWebclient().getProductXrefUrl(), customerNumber, customerPartNumber),throwable));
	}

	@Override
	public Mono<Product> findByInventoryItemIDAndOrgID(Long inventoryItemId, Long orgID) {
		log.info("IN ProductWebClientImpl -- Before calling Product By InventoryItemID and Org ID for {}", inventoryItemId);
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getProductInvidOrgidUrl(), inventoryItemId, orgID)))
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, productExceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, productExceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, productExceptionFunction)
				.bodyToMono(Product.class)
				.timeout(Duration.ofMillis(TIMEOUT_4000MS))
				.retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(ApplicationConstants.RETRY_SECONDS)))
				.doOnError(throwable -> log.error("Error pulling findByInventoryItemIDAndOrgID using URL: "
						+String.format(applicationProperties.getWebclient().getProductInvidOrgidUrl(), inventoryItemId, orgID),throwable));
	}

	@Override
	public Mono<Product> findByProductNumberAndOrgID(String productNumber, long orgID) {
		log.info("IN ProductWebClientImpl -- Before calling Product By Product Number and Org ID : {}", productNumber);
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getProductFindbyproductnumberUrl(), productNumber, orgID)))
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, productExceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, productExceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, productExceptionFunction)
				.bodyToMono(Product.class)
				.doOnError(throwable -> log.error("Error pulling Product Details using URL: "
						+String.format(applicationProperties.getWebclient().getProductFindbyproductnumberUrl(), productNumber, orgID),throwable));
	}

	@Override
	public Flux<Catalog> findByInventoryItemIDAndOrgIDAndAttrName(Long inventoryItemId, Long orgID, String attrName) {
		return webClient.get().
				uri(URI.create(String.format(applicationProperties.getWebclient().getProductInvidOrgidUrlAttrnme(),
						inventoryItemId, orgID, attrName))).
				header("XATOM-CLIENTID", applicationProperties.getApplicationName()).
		        retrieve()
				.onStatus(HttpStatus::is3xxRedirection, productExceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, productExceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, productExceptionFunction)
				.bodyToFlux(Catalog.class)
				.doOnError(throwable -> log.error("Error pulling Product Details using URL: "
				+String.format(applicationProperties.getWebclient().getProductFindbyproductnumberUrl(), inventoryItemId, orgID),throwable));

	}


	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response.bodyToMono(ProductRef.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.PRODUCT_XREF));

	private final Function<ClientResponse, Mono<? extends Throwable>> productExceptionFunction = response -> response.bodyToMono(ProductRef.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.PRODUCT));
}


