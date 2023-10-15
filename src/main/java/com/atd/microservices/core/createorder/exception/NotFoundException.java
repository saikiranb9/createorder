package com.atd.microservices.core.createorder.exception;

import com.atd.microservices.core.createorder.external.domains.deserializer.JsonDateTimeDeserializer;
import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.ZonedDateTime;

/**
 * @author Vijay, YERRA
 */
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = -2388797628446779439L;

	@JsonDeserialize(using = JsonDateTimeDeserializer.class)
    @JsonSerialize(using = JsonDateTimeSerializer.class)
    private final ZonedDateTime timestamp;
    private String clientName;
    private String message;

    public NotFoundException(Throwable e) {
        super(e);
        this.timestamp = ZonedDateTime.now();
    }

    public NotFoundException(String message, String clientName) {
        super(message);
        this.message = message;
        this.clientName = clientName;
        this.timestamp = ZonedDateTime.now();
    }

    public NotFoundException(Throwable exceptions, String message, String clientName) {
        super(exceptions);
        this.message = message;
        this.clientName = clientName;
        this.timestamp = ZonedDateTime.now();
    }

}
