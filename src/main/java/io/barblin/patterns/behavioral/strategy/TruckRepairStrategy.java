package io.barblin.patterns.behavioral.strategy;

public final class TruckRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Truck";
    }
}
