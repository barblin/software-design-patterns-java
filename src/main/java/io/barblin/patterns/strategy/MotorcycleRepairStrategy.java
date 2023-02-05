package io.barblin.patterns.strategy;

final class MotorcycleRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Motorcycle";
    }
}