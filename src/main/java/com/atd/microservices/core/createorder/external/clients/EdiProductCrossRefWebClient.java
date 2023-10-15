package com.atd.microservices.core.createorder.external.clients;

import com.atd.microservices.core.createorder.external.domains.EDIProductCrossReference;

import reactor.core.publisher.Mono;

public interface EdiProductCrossRefWebClient {

	Mono<EDIProductCrossReference> getProductCrossRef(String customerId, String partnerProductNumber, String brandName);

}
