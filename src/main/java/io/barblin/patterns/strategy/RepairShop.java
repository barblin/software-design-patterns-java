package io.barblin.patterns.strategy;

import io.barblin.patterns.strategy.vehicles.Vehicle;
import io.barblin.patterns.strategy.vehicles.Vehicle.VehicleType;

import java.util.EnumMap;
import java.util.Objects;

public final class RepairShop {

    private final EnumMap<VehicleType, RepairStrategy> strategies;
    private final DefaultRepairStrategy defaultRepairStrategy;

    public RepairShop() {
        strategies = new EnumMap<>(VehicleType.class);
        defaultRepairStrategy = new DefaultRepairStrategy();
    }

    public void registerStrategy(VehicleType type, RepairStrategy strategy) {
        strategies.put(type, strategy);
    }

    public String repair(Vehicle vehicle) {
        if (Objects.isNull(vehicle)) {
            throw new IllegalArgumentException("");
        }

        return strategies.getOrDefault(vehicle.getType(), defaultRepairStrategy).repair();
    }
}