package com.atd.microservices.core.createorder.handler;

import org.springframework.lang.NonNullApi;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface CreateOrderHandler {

    Mono<ServerResponse> createOrder(ServerRequest request);

    Mono<ServerResponse> createOrderByLocation(ServerRequest request);
}
