package com.atd.microservices.core.createorder.external.clients;

import com.atd.domain.microservices.product.Catalog;
import reactor.core.publisher.Flux;

public interface CatalogWebClient {

	Flux<Catalog> findByOrgIDAndAttrNameAndAtrrValue(Long orgID, String attrValue, String attrName);

}
