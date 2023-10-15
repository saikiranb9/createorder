package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.domain.microservices.customerlocation.SiteUse;
import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.CustomerLocationWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.function.Function;

/**
 * @author Vijay, YERRA
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class CustomerLocationWebClientImpl implements CustomerLocationWebClient {

	private final WebClient webClient;
	private final ApplicationProperties applicationProperties;

	@Override
	public Flux<SiteUse> getLocationByStoreNumber(String customerID, String storeNumber) {
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getCustomerlocationStorenumberUrl(), customerID, storeNumber)))
				.header(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToFlux(SiteUse.class)
				.filter(siteUse -> StringUtils.equalsIgnoreCase(siteUse.getSiteUseStatus(),ApplicationConstants.ACTIVE_A))
				.doOnError(throwable -> log.error("Error pulling getLocationByStoreNumber Details using URL: "
						+String.format(applicationProperties.getWebclient().getCustomerlocationStorenumberUrl(), customerID, storeNumber),throwable));
	}

	@Override
	public Flux<SiteUse> getLocationByAttribute4StoreNumber(String customerID, String attribute4) {
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getCustomerlocationAttribute4Url(), customerID, attribute4)))
				.header(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToFlux(SiteUse.class)
				.filter(siteUse -> StringUtils.equalsIgnoreCase(siteUse.getSiteUseStatus(),ApplicationConstants.ACTIVE_A))
				.doOnError(throwable -> log.error("Error pulling getLocationByAttribute4StoreNumber Details using URL: "
						+String.format(applicationProperties.getWebclient().getCustomerlocationAttribute4Url(), customerID, attribute4),throwable));
	}

	@Override
	public Flux<SiteUse> getLocationByLocationNumber(String storeNumber) {
		return webClient
				.get()
				.uri(URI.create(
						String.format(applicationProperties.getWebclient().getCustomerlocationLocationnumberUrl(), storeNumber)))
				.header(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName())
				.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
				.onStatus(HttpStatus::is4xxClientError, exceptionFunction)
				.onStatus(HttpStatus::is5xxServerError, exceptionFunction)
				.bodyToFlux(SiteUse.class)
				.filter(siteUse -> StringUtils.equalsIgnoreCase(siteUse.getSiteUseStatus(),ApplicationConstants.ACTIVE_A))
				.doOnError(throwable -> log.error("Error pulling getLocationByStoreNumber Details using URL: "
						+String.format(applicationProperties.getWebclient().getCustomerlocationLocationnumberUrl(), storeNumber),throwable));
	}


	private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response.bodyToMono(SiteUse.class)
			.map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body), ApplicationConstants.CUSTOMER_LOCATION));
}


