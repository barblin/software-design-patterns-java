package io.barblin.patterns.strategy;

public final class CarRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Car";
    }
    
}
