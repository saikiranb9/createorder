package com.atd.microservices.core.createorder.external.clients;

import com.atd.microservices.core.createorder.external.domains.FndConfig;
import reactor.core.publisher.Flux;

public interface FndConfigWebClient {
    Flux<FndConfig> getPackConfig();
}
