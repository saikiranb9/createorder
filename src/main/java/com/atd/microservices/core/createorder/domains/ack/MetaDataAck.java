package com.atd.microservices.core.createorder.domains.ack;

import lombok.Data;

@Data
public class MetaDataAck {
    private String traceId;
    private String senderCode;
    private String receiverCode;
}