package com.atd.microservices.core.createorder.config;

import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.sleuth.instrument.kafka.TracingKafkaProducerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderOptions;

@Configuration
public class ReactiveKafkaProducerConfig {

	@Bean
	public KafkaSender<String, Object> reactiveKafkaSender(KafkaProperties properties, BeanFactory beanFactory) {
		Map<String, Object> map = properties.getProducer().buildProperties();
		map.put("ssl.endpoint.identification.algorithm", "");
		return KafkaSender.create(new TracingKafkaProducerFactory(beanFactory), SenderOptions.create(map));
	}
}