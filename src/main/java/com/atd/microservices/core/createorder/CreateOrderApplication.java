package com.atd.microservices.core.createorder;

import com.atd.microservices.core.createorder.config.ApplicationProperties;

import brave.Span.Kind;
import brave.baggage.BaggagePropagation;
import brave.propagation.B3Propagation;
import brave.propagation.Propagation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class CreateOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateOrderApplication.class, args);
	}
	
	static final Propagation.Factory B3_FACTORY = B3Propagation.newFactoryBuilder()
			.injectFormat(Kind.PRODUCER, B3Propagation.Format.MULTI).build();

	@Bean
	BaggagePropagation.FactoryBuilder baggagePropagationFactoryBuilder() {
		return BaggagePropagation.newFactoryBuilder(B3_FACTORY);
	}

}
