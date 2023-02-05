package io.barblin.patterns.strategy;

final class CarRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Car";
    }
    
}
