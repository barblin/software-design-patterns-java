package io.barblin.patterns.structural.bridge;

public record DeliveryStandard() implements DeliveryMethod {
    @Override
    public String deliver() {
        return "Your purchase will arrive in 2-5 business days.";
    }
}
