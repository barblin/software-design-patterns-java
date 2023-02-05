package io.barblin.patterns.behavioral.strategy.vehicles;

public final class Motorcycle implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORCYCLE;
    }

}
