package io.barblin.patterns.strategy;

public final class DefaultRepairStrategy implements RepairStrategy {
    @Override
    public String repair() {
        return "Not supported";
    }
}
