package com.atd.microservices.core.createorder.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Data
@ToString
@Builder
@Jacksonized
public class ProductRef {
    private String productId;
    private String productNumber;
}
