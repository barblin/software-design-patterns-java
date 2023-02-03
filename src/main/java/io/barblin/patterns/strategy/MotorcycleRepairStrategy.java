package io.barblin.patterns.strategy;

public final class MotorcycleRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Motorcycle";
    }
}