package io.barblin.patterns.behavioral.template_method;

import java.util.List;

public class BikeService extends VehicleServiceTemplate {
    @Override
    protected void checkOil(Vehicle vehicle, List<String> issues) {
        if (vehicle.getOilQuality() < 3) {
            issues.add("Oil quality insufficient");
        }
    }

    @Override
    protected void checkFilters(Vehicle vehicle, List<String> issues) {
        // ignored, bike does not contain filters
    }

    @Override
    protected void checkTires(Vehicle vehicle, List<String> issues) {
        if (vehicle.getTireProfileDepth() < 3) {
            issues.add("Tire profile depth insufficient");
        }
    }

    @Override
    protected void customChecks(Vehicle vehicle, List<String> issues) {
        // bike requires chain checks -> custom implementation for bike
        Bike bike = (Bike) vehicle;

        if (bike.chainQuality() < 3) {
            issues.add("Chain quality insufficient");
        }
    }
}
