package io.barblin.patterns.behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class VehicleServiceTemplate {

    public record Report(boolean containsCritical, List<String> issues) {
    }

    protected abstract void checkOil(Vehicle vehicle, List<String> issues);

    protected abstract void checkFilters(Vehicle vehicle, List<String> issues);

    protected abstract void checkTires(Vehicle vehicle, List<String> issues);

    // a method designed to provide the developer with a hook to perform custom checks
    protected abstract void customChecks(Vehicle vehicle, List<String> issues);

    public Report performChecklist(Vehicle vehicle) {
        List<String> issues = new ArrayList<>();

        checkOil(vehicle, issues);
        checkFilters(vehicle, issues);
        checkTires(vehicle, issues);
        customChecks(vehicle, issues);

        return new Report(!issues.isEmpty(), issues);
    }
}
