package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.ProcessOrderWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import com.atd.microservices.core.createorder.external.domains.processorderv2.MasterOrderResponse;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;

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
import static com.atd.microservices.core.createorder.external.clients.CommonClient.TIMEOUT_1000MS;

/**
 * @author Vijay, YERRA
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class ProcessOrderWebClientImpl implements ProcessOrderWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Mono<MasterOrderResponse> processOrder(Order order) {
		log.info("IN ProcessOrderWebClientImpl -- Before calling Process Order V2 with Doc Ref : {}", order.getHeader().getOrigsysdocumentref());
		return webClient
				.post()
				.uri(URI.create(String.format(applicationProperties.getWebclient().getProcessorderProcessUrl(),
						order.getHeader().getOrgid(),
						order.getHeader().getOrigsysdocumentref())))
				.header("XATOM-CLIENTID", applicationProperties.getApplicationName())
				.body(Mono.just(order), Order.class)
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToMono(MasterOrderResponse.class)
//				.timeout(Duration.ofMillis(TIMEOUT_1000MS))
//				.retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(ApplicationConstants.RETRY_SECONDS)))
				.doOnError(throwable -> log.error("Error in processOrder Details using URL: "
						+ String.format(applicationProperties.getWebclient().getProcessorderProcessUrl(),
						order.getHeader().getOrgid(),
						order.getHeader().getOrigsysdocumentref()),throwable));
	}

	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response.bodyToMono(MasterOrderResponse.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.PROCESS_ORDER));
}


