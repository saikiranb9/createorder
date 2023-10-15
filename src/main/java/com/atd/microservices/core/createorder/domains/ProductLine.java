package com.atd.microservices.core.createorder.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ProductLine {
    private String id;
    private String customerPOLineId;
    private String upc;
    private long quantity;
    private String brand;
}
