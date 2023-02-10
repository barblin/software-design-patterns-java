package io.barblin.patterns.structural.bridge;

public final class PurchaseStandard extends Purchase {
    public PurchaseStandard(DeliveryMethod deliveryMethod) {
        super(deliveryMethod);
    }

    @Override
    public String complete() {
        return "Thank you for your order. " +
                this.deliveryMethod.deliver();
    }
}
