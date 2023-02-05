package io.barblin.patterns.strategy;

final class DefaultRepairStrategy implements RepairStrategy {
    @Override
    public String repair() {
        return "Not supported";
    }
}
