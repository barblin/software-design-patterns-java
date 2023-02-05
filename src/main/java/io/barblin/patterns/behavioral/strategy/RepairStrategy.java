package io.barblin.patterns.behavioral.strategy;

public sealed interface RepairStrategy permits
        CarRepairStrategy,
        MotorcycleRepairStrategy,
        TruckRepairStrategy,
        DefaultRepairStrategy {

    String repair();
}
