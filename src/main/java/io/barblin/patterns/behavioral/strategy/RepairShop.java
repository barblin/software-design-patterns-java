package io.barblin.patterns.behavioral.strategy;

import io.barblin.patterns.behavioral.strategy.vehicles.Vehicle;

import java.util.EnumMap;
import java.util.Objects;

public final class RepairShop {

    private final EnumMap<Vehicle.VehicleType, RepairStrategy> strategies;
    private final DefaultRepairStrategy defaultRepairStrategy;

    public RepairShop() {
        strategies = new EnumMap<>(Vehicle.VehicleType.class);
        defaultRepairStrategy = new DefaultRepairStrategy();
    }

    public void registerStrategy(Vehicle.VehicleType type, RepairStrategy strategy) {
        strategies.put(type, strategy);
    }

    public String repair(Vehicle vehicle) {
        if (Objects.isNull(vehicle)) {
            throw new IllegalArgumentException("");
        }

        return strategies.getOrDefault(vehicle.getType(), defaultRepairStrategy).repair();
    }
}