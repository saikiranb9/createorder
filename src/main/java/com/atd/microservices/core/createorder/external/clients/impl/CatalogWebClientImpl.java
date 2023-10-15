package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.domain.microservices.product.Catalog;
import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.CatalogWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.net.URI;
import java.time.Duration;
import java.util.function.Function;

import static com.atd.microservices.core.createorder.constants.ApplicationConstants.RETRY_SECONDS;
import static com.atd.microservices.core.createorder.external.clients.CommonClient.MAX_RETRY_COUNT;
import static com.atd.microservices.core.createorder.external.clients.CommonClient.TIMEOUT_1000MS;

@Component
@Slf4j
@RequiredArgsConstructor
public class CatalogWebClientImpl implements CatalogWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Flux<Catalog> findByOrgIDAndAttrNameAndAtrrValue(Long orgID, String attrValue, String attrName) {
		log.info("IN CatalogWebClientImpl -- Before calling Catalog By {}", attrName);
		return webClient
				.get()
				.uri(uriBuilder -> UriComponentsBuilder
						.fromUri(URI.create(String.format(applicationProperties.getWebclient().getCatalogOrgidUrl(), orgID)))
						.queryParam("attributeName", attrName)
						.queryParam("attributeValue", attrValue)
						.encode()
						.build().toUri()
				)
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, catalogExceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, catalogExceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, catalogExceptionFunction)
				.bodyToFlux(Catalog.class)
				.defaultIfEmpty(new Catalog())
//				.timeout(Duration.ofMillis(TIMEOUT_1000MS))
//				.retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(RETRY_SECONDS)))
				.doOnError(throwable -> log.error("Error pulling Catalog using URL: "
						+String.format(applicationProperties.getWebclient().getCatalogOrgidUrl().concat("?attributeValue=%3$s"),
						orgID, attrName, attrValue),throwable));
	}

	private final Function<ClientResponse, Mono<? extends Throwable>> catalogExceptionFunction = response -> response.bodyToMono(Catalog.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.CATALOG));
}
