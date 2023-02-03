package io.barblin.patterns.strategy.vehicles;

public final class Truck implements Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
    
}
