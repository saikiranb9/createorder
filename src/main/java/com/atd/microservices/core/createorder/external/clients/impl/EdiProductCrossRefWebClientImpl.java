package com.atd.microservices.core.createorder.external.clients.impl;

import java.net.URI;
import java.util.function.Function;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.EdiProductCrossRefWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import com.atd.microservices.core.createorder.external.domains.EDIProductCrossReference;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@RequiredArgsConstructor
public class EdiProductCrossRefWebClientImpl implements EdiProductCrossRefWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Mono<EDIProductCrossReference> getProductCrossRef(String partnerId, String partnerProductNumber,
			String brandName) {

		return webClient.get()
				.uri(URI.create(String.format(applicationProperties.getWebclient().getEdicrossrefUrl(), partnerId,
						partnerProductNumber, brandName)))
				.header(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName()).retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction).bodyToMono(EDIProductCrossReference.class)
				.doOnError(throwable -> log.error("Error pulling product cross reference details using URL: "
						+ String.format(applicationProperties.getWebclient().getEdicrossrefUrl(), partnerId,
								partnerProductNumber, brandName),
						throwable));
	}

	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response
			.bodyToMono(EDIProductCrossReference.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body),
					ApplicationConstants.EDI_CROSS_REF));

}
