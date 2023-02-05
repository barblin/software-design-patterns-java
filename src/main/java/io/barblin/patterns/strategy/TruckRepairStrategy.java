package io.barblin.patterns.strategy;

final class TruckRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Truck";
    }
}
