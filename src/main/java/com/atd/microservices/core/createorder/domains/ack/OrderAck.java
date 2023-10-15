package com.atd.microservices.core.createorder.domains.ack;

@lombok.Data
public class OrderAck {

    private MetaDataAck metadata;
    private Data data;

}
