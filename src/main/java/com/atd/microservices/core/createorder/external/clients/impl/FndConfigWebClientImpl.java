package com.atd.microservices.core.createorder.external.clients.impl;

import com.atd.microservices.core.createorder.config.ApplicationProperties;
import com.atd.microservices.core.createorder.constants.ApplicationConstants;
import com.atd.microservices.core.createorder.external.clients.FndConfigWebClient;
import com.atd.microservices.core.createorder.external.clients.exception.WebClientException;
import com.atd.microservices.core.createorder.external.domains.EDIProductCrossReference;
import com.atd.microservices.core.createorder.external.domains.FndConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.function.Function;

@Component
@Slf4j
@RequiredArgsConstructor
public class FndConfigWebClientImpl implements FndConfigWebClient {

    private final WebClient webClient;

    private final ApplicationProperties applicationProperties;


    @Override
    public Flux<FndConfig> getPackConfig() {

        return webClient.get().uri(URI.create(String.format(applicationProperties.getWebclient().getFndConfigUrl(), ApplicationConstants.VALUE_SET)))
                .header(ApplicationConstants.XATOM_CLIENTID, applicationProperties.getApplicationName()).retrieve()
                .onStatus(HttpStatus::is3xxRedirection, exceptionFunction)
                .onStatus(HttpStatus::is4xxClientError, exceptionFunction)
                .onStatus(HttpStatus::is5xxServerError, exceptionFunction).bodyToFlux(FndConfig.class)
                .doOnError(throwable -> log.error("Error pulling product cross reference details using URL: "
                                + String.format(applicationProperties.getWebclient().getEdicrossrefUrl(),ApplicationConstants.VALUE_SET),
                        throwable));

    }

    private final Function<ClientResponse, Mono<? extends Throwable>> exceptionFunction = response -> response
            .bodyToMono(FndConfig.class)
            .map(body -> new WebClientException(String.format("%s, response body: %s", response.statusCode(), body),
                    ApplicationConstants.VALUE_SET));
}