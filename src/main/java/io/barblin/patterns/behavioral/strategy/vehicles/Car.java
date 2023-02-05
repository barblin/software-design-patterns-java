package io.barblin.patterns.behavioral.strategy.vehicles;

public final class Car implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

}
