package io.barblin.patterns.structural.bridge;

public sealed interface DeliveryMethod permits DeliveryStandard, DeliveryExpress {

    String deliver();
}
