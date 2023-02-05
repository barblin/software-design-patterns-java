package io.barblin.patterns.behavioral.strategy;

final class DefaultRepairStrategy implements RepairStrategy {
    @Override
    public String repair() {
        return "Not supported";
    }
}
