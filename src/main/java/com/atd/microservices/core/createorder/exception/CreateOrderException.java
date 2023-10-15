package com.atd.microservices.core.createorder.exception;

import com.atd.microservices.core.createorder.external.domains.deserializer.JsonDateTimeDeserializer;
import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.ZonedDateTime;

/**
 * @author Vijay, YERRA
 */
public class CreateOrderException extends RuntimeException {

    private static final long serialVersionUID = -1914755989629508836L;
    
	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    private final ZonedDateTime timestamp;
    private String message;

    public CreateOrderException(Throwable e) {
        super(e);
        this.timestamp = ZonedDateTime.now();
    }

    public CreateOrderException(String message) {
        super(message);
        this.message = message;
        this.timestamp = ZonedDateTime.now();
    }

    public CreateOrderException(Throwable exceptions, String message) {
        super(exceptions);
        this.message = message;
        this.timestamp = ZonedDateTime.now();
    }

}
