package com.atd.microservices.core.createorder.mapper;

import com.atd.domain.microservices.customerlocation.SiteUse;
import com.atd.domain.microservices.ediconfig.EdiConfig;
import com.atd.microservices.core.createorder.domains.CreateOrder;
import com.atd.microservices.core.createorder.dto.ProductRef;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichment;
import com.atd.microservices.core.createorder.external.domains.orderenrichment.ProductLine;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Mapper
public interface OrderEnrichmentMapper {

    @Mapping(source = "createOrder.customerPONumber", target = "customerPONumber")
    @Mapping(source = "createOrder.prxCheckEnabled", target = "prxCheckEnabled")
    @Mapping(source = "createOrder.disableViv", target = "disableViv")
    @Mapping(source = "siteUse.locationNumber", target = "locationNumber")
    @Mapping(source = "ediConfig.fillOrKill", target = "fillOrKill")
    @Mapping(source = "ediConfig.fulfillmentType", target = "fulfilmentType")
    @Mapping(target = "products", expression = "java(mapProductLines(createOrder,productRefs))")
    OrderEnrichment prepareOrderEnrichment(CreateOrder createOrder, EdiConfig ediConfig, SiteUse siteUse, List<ProductRef> productRefs);

    default List<ProductLine> mapProductLines(CreateOrder createOrder, List<ProductRef> productRefs) {
        AtomicInteger index = new AtomicInteger();
        return createOrder.getProducts().stream()
                .map(productLine -> {
                    final Optional<ProductRef> productRef = productRefs.stream()
                            .filter(itemCrossReferences1 -> itemCrossReferences1.getProductId()!=null)
                            .filter(itemCrossReferences1 -> itemCrossReferences1.getProductId()
                                    .equals(productLine.getId()))
                            .findFirst();
                    if(productRef.isPresent()) {
                        index.getAndIncrement();
                        ProductLine productLine1 = new ProductLine();
                        productLine1.setLineId(""+index);
                        productLine1.setProductNumber(productRef.get().getProductNumber());
                        productLine1.setCustomerPOLineId(productLine.getCustomerPOLineId());
                        productLine1.setQuantity(productLine.getQuantity());
                        return productLine1;
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
