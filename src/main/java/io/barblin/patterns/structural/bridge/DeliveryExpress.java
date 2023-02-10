package io.barblin.patterns.structural.bridge;

public record DeliveryExpress() implements DeliveryMethod {
    @Override
    public String deliver() {
        return "Your purchase will arrive in 1-2 business days.";
    }
}
