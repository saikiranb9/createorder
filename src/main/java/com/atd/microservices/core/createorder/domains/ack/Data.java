package com.atd.microservices.core.createorder.domains.ack;

import java.util.List;

@lombok.Data
public class Data {
    private String locationNumber;
    private Long primaryDCID;
    private String origsysdocumentref;
    private String customerPO;
    private long count;
    private List<Product> products;
}