package io.barblin.patterns.behavioral.strategy;

public final class CarRepairStrategy implements RepairStrategy {

    @Override
    public String repair() {
        return "Car";
    }
    
}
