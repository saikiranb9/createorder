package com.atd.microservices.core.createorder.external.domains.serializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateTimeSerializer extends JsonSerializer<ZonedDateTime> {
	public static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;


	@Override
	public void serialize(ZonedDateTime dateTime, JsonGenerator gen, SerializerProvider arg2) throws IOException {
		gen.writeString(dateTime.format(DATE_TIME_FORMATTER)); 
	}

}