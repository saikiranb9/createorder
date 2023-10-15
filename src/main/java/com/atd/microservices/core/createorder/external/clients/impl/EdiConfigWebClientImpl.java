package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.domain.microservices.ediconfig.EdiConfig;
import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.EdiConfigWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
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
public class EdiConfigWebClientImpl implements EdiConfigWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;
	private final ObjectMapper mapper = new JsonMapper();

	public Mono<EdiConfig> getEdiConfigForCustomer(String senderCode, String receiverCode) {
		log.info("IN EdiConfigWebClientImpl -- Before calling EDI Config");
		return webClient.get()
				.uri(URI.create(String.format(applicationProperties.getWebclient().getEdiconfigUrl(), senderCode, receiverCode)))
				.headers(headers -> {
					headers.set(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName());
				}).retrieve().onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction).bodyToMono(EdiConfig.class)
//                .timeout(Duration.ofMillis(TIMEOUT_1000MS))
//                .retryWhen(Retry.backoff(MAX_RETRY_COUNT, Duration.ofSeconds(ApplicationConstants.RETRY_SECONDS)))
				.doOnError(throwable -> log.error(
						"Error pulling getEdiConfigForCustomer Details using URL: "
								+ String.format(applicationProperties.getWebclient().getEdiconfigUrl(), senderCode, receiverCode),
						throwable));
	}

	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response
			.bodyToMono(EdiConfig.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body),
					ApplicationConstants.EDIT_CONFIG));
}
