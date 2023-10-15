package com.atd.microservices.core.createorder.external.clients;

import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichment;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichmentResponse;

import reactor.core.publisher.Mono;

public interface OrderEnrichmentWebClient {

    Mono<OrderEnrichmentResponse> enrichOrder(OrderEnrichment orderEnrichment);
    
}
