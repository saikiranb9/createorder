package com.atd.microservices.core.createorder.external.domains.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.MediaSize.ISO;

import org.springframework.format.annotation.DateTimeFormat;

public class JsonDateTimeSCDFSerializer extends JsonSerializer<ZonedDateTime> {

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
//    public static final DateTimeFormatter DATE_TIME_FORMATTER = (DateTimeFormatter.ISO_DATE_TIME);

    private static final ZoneId est5edtZoneid = ZoneId.of("EST5EDT");

    @Override
    public void serialize(ZonedDateTime dateTime, JsonGenerator gen, SerializerProvider arg2)
            throws IOException {
        gen.writeString(dateTime.withZoneSameInstant(est5edtZoneid).format(DATE_TIME_FORMATTER));
    }

}