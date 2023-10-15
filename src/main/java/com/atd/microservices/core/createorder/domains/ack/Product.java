package com.atd.microservices.core.createorder.domains.ack;

import lombok.Data;

@Data
public class Product {
    private String id;
    private Long customerPOLineId;
    private Long totalReqQty;
    private Long filledQty;
    private Long killedQty;
    private String vendorName;
    private String acknowledgementReasonCode;
}