package com.atd.microservices.core.createorder.mapper;

import com.atd.microservices.core.createorder.external.domains.orderenrichment.OrderEnrichmentResponse;
import com.atd.microservices.core.createorder.external.domains.processorderv2.Order;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProcessOrderMapper {

    @Mapping(source = "header", target = "header")
    @Mapping(source = "lines", target = "lines")
    Order prepareOrder(OrderEnrichmentResponse order);

}
