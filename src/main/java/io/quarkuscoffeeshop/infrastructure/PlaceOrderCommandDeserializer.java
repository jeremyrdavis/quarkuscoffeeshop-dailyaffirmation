package io.quarkuscoffeeshop.infrastructure;

import io.quarkuscoffeeshop.domain.PlaceOrderCommand;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class PlaceOrderCommandDeserializer extends ObjectMapperDeserializer<PlaceOrderCommand> {

    public PlaceOrderCommandDeserializer() {
        super(PlaceOrderCommand.class);
    }
}
