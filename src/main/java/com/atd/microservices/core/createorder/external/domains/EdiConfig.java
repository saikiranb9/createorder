package com.atd.microservices.core.createorder.external.domains;

import lombok.Data;

@Data
public class EdiConfig {

    private String fillOrKill;
    private String customerID;
    private String fulfillmentType;

}
