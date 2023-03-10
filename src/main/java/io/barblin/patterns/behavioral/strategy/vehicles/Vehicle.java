package io.barblin.patterns.behavioral.strategy.vehicles;

public sealed interface Vehicle permits Car, Motorcycle, Truck, Spaceship {

    public enum VehicleType {
        CAR,
        MOTORCYCLE,
        TRUCK,
        OTHER
    }

    VehicleType getType();
}