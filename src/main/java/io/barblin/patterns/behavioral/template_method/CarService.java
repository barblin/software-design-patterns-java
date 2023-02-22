package io.barblin.patterns.behavioral.template_method;

import java.util.List;

public class CarService extends VehicleServiceTemplate {

    @Override
    protected void checkOil(Vehicle vehicle, List<String> issues) {
        if (vehicle.getOilLevel() < 3) {
            issues.add("Oil level insufficient");
        }

        if (vehicle.getOilQuality() < 3) {
            issues.add("Oil quality insufficient");
        }
    }

    @Override
    protected void checkFilters(Vehicle vehicle, List<String> issues) {
        if (vehicle.getFilterQuality() < 3) {
            issues.add("Filter quality insufficient");
        }
    }

    @Override
    protected void checkTires(Vehicle vehicle, List<String> issues) {
        if (vehicle.getTireProfileDepth() < 3) {
            issues.add("Tire profile depth insufficient");
        }
    }

    @Override
    protected void customChecks(Vehicle vehicle, List<String> issues) {
        // car does not require custom checks -> ignored
    }
}
