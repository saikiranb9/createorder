package com.atd.microservices.core.createorder.external.clients;

import com.atd.microservices.core.createorder.external.domains.processorderv2.MasterOrderResponse;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;

import reactor.core.publisher.Mono;

public interface ProcessOrderWebClient {

    Mono<MasterOrderResponse> processOrder(Order order);
}
