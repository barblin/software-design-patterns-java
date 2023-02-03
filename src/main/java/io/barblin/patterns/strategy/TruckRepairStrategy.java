package io.barblin.patterns.strategy;

public final class TruckRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Truck";
    }
}
