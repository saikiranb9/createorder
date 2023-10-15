package com.atd.microservices.core.createorder.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class CreateOrderMaster {

    private String customerPONumber;
    private boolean prxCheckEnabled;
    private boolean disableViv = true;
    private List<ProductLine> products;
}
