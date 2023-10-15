package com.atd.microservices.core.createorder.management;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class CreateOrderMetricsService {

    public static final String CREATE_ORDER_METER_NAME = "createorder";
    public static final String CREATE_ORDER_METER_DESCRIPTION =
        "Indicates create order metrics.";
    public static final String CREATE_ORDER_METER_BASE_UNIT = "order";
    public static final String CREATE_ORDER_METER_CAUSE_DIMENSION = "count";

    private final Counter killedProductsCounter;

    public CreateOrderMetricsService(MeterRegistry registry) {
        this.killedProductsCounter = killedProductsBuilder("killed-products").register(registry);
    }

    private Counter.Builder killedProductsBuilder(String cause) {
        return Counter
            .builder(CREATE_ORDER_METER_NAME)
            .baseUnit(CREATE_ORDER_METER_BASE_UNIT)
            .description(CREATE_ORDER_METER_DESCRIPTION)
            .tag(CREATE_ORDER_METER_CAUSE_DIMENSION, cause);
    }

    public void trackAllKilledProducts() {
        this.killedProductsCounter.increment();
    }
}