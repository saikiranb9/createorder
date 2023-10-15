package com.atd.microservices.core.createorder.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.time.Duration;

/**
 * @author Vijay, YERRA
 */
@Configuration
public class WebClientConfiguration {

    static final int SIZE = 10 * 1024 * 1024; //10MB
    private final ObjectMapper objectMapper;

    public WebClientConfiguration(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Bean
    public WebClient webClient() {

        Jackson2JsonEncoder encoder = new Jackson2JsonEncoder(objectMapper);
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> {
                    codecs.defaultCodecs().jackson2JsonEncoder(encoder);
                    codecs.defaultCodecs().maxInMemorySize(SIZE);
                })
                .build();

        ConnectionProvider provider = ConnectionProvider.builder("fixed_pool")
                .maxConnections(500)
                .maxIdleTime(Duration.ofSeconds(20))
                .maxLifeTime(Duration.ofSeconds(60))
                .pendingAcquireTimeout(Duration.ofSeconds(60))
                .evictInBackground(Duration.ofSeconds(120)).build();

        return WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create(provider)))
                .exchangeStrategies(strategies)
                .build();
    }
}
