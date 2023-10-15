package com.atd.microservices.core.createorder.external.domains.deserializer;

import java.io.IOException;
import java.time.ZonedDateTime;

import com.atd.microservices.core.createorder.external.domains.serializer.JsonDateTimeSerializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

	@Override
	public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException {
		return ZonedDateTime.parse(jsonParser.getText(), JsonDateTimeSerializer.DATE_TIME_FORMATTER);
	}
}