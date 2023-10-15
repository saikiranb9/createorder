package com.atd.microservices.core.createorder.external.clients;

import com.atd.domain.microservices.ediconfig.EdiConfig;
import reactor.core.publisher.Mono;

public interface EdiConfigWebClient {

    Mono<EdiConfig> getEdiConfigForCustomer(String senderCode, String receiverCode);
}
