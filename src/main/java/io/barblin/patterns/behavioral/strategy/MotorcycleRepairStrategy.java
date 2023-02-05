package io.barblin.patterns.behavioral.strategy;

public final class MotorcycleRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Motorcycle";
    }
}