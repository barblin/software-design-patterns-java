package io.barblin.patterns.structural.bridge;

public abstract class Purchase {

    protected final DeliveryMethod deliveryMethod;

    public Purchase(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    abstract String complete();
}
