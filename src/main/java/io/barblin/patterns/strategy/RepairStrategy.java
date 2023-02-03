package io.barblin.patterns.strategy;

public sealed interface RepairStrategy permits
        CarRepairStrategy,
        MotorcycleRepairStrategy,
        TruckRepairStrategy,
        DefaultRepairStrategy {

    String repair();
}
