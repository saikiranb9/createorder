package com.atd.microservices.core.createorder.external.clients;

import com.atd.domain.microservices.product.Catalog;
import com.atd.domain.microservices.product.ItemCrossReferences;
import com.atd.domain.microservices.product.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductWebClient {

    Mono<ItemCrossReferences> getProductXrefForCustomer(String customerNumber, String customerPartNumber);

    Mono<Product> findByInventoryItemIDAndOrgID(Long inventoryItemId, Long orgID);

    Mono<Product> findByProductNumberAndOrgID(String productNumber, long orgID);

    Flux<Catalog> findByInventoryItemIDAndOrgIDAndAttrName(Long inventoryItemId, Long orgID, String attrName);
}
