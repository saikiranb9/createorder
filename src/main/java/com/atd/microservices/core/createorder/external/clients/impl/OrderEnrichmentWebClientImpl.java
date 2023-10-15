package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.exception.NotFoundException;
import com.atd.microservices.core.createorder.external.clients.OrderEnrichmentWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichment;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichmentResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.net.URI;
import java.time.Duration;
import java.util.function.Function;

import static com.atd.microservices.core.createorder.external.clients.CommonClient.MAX_RETRY_COUNT;

/**
 * @author Vijay, YERRA
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class OrderEnrichmentWebClientImpl implements OrderEnrichmentWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Mono<OrderEnrichmentResponse> enrichOrder(OrderEnrichment orderEnrichment) {
		log.info("IN OrderEnrichmentWebClientImpl -- Before calling Order Enrichment");
		return webClient
				.post()
				.uri(URI.create(applicationProperties.getWebclient().getOrderenrichmentUrl()))
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.body(Mono.just(orderEnrichment), OrderEnrichment.class)
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToMono(OrderEnrichmentResponse.class)
				.switchIfEmpty(Mono.error(new NotFoundException("No Product received from order enrichment", ApplicationConstants.ORDER_ENRICHMENT)))
//				.retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(ApplicationConstants.RETRY_SECONDS)))
				.doOnError(throwable -> log.error("Error in enrichOrder Details using URL: "
						+ applicationProperties.getWebclient().getOrderenrichmentUrl(),throwable));
	}

	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response.bodyToMono(OrderEnrichmentResponse.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.ORDER_ENRICHMENT));
}


