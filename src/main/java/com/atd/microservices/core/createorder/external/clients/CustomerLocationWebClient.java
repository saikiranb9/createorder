package com.atd.microservices.core.createorder.external.clients;

import com.atd.domain.microservices.customerlocation.SiteUse;
import reactor.core.publisher.Flux;

public interface CustomerLocationWebClient {

    Flux<SiteUse> getLocationByStoreNumber(String customerID, String storeNumber);

    Flux<SiteUse> getLocationByAttribute4StoreNumber(String customerID, String attribute4);

    Flux<SiteUse> getLocationByLocationNumber(String storeNumber);
}
