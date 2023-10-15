package com.atd.microservices.core.createorder.external.clients.exception;

import com.atd.microservices.core.createorder.external.domains.deserializer.JsonDateTimeDeserializer;
import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.ZonedDateTime;

public class WebClientException extends RuntimeException {

    private static final long serialVersionUID = -1072673299587449245L;

    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    private final ZonedDateTime timestamp;
    private String message;
    private String clientName;

    public WebClientException(Throwable e) {
        super(e);
        this.timestamp = ZonedDateTime.now();
    }

    public WebClientException(String message, String clientName) {
        super(message);
        this.message = message;
        this.clientName = clientName;
        this.timestamp = ZonedDateTime.now();
    }

    public WebClientException(Throwable exceptions, String message, String clientName) {
        super(exceptions);
        this.message = message;
        this.clientName = clientName;
        this.timestamp = ZonedDateTime.now();
    }
}
