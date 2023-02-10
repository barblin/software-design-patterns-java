package io.barblin.patterns.structural.bridge;

public final class PurchaseSubscription extends Purchase {
    public PurchaseSubscription(DeliveryMethod deliveryMethod) {
        super(deliveryMethod);
    }

    @Override
    public String complete() {
        return "Your subscription is all set. Your next delivery is on the way. " +
                this.deliveryMethod.deliver();
    }
}
