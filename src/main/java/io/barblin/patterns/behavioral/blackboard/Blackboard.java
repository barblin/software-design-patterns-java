package io.barblin.patterns.behavioral.blackboard;

import java.util.ArrayList;
import java.util.List;

public class Blackboard {
    private final List<Component> components;
    private final List<Assembly> assemblies;
    private boolean inProgress = true;

    public Blackboard() {
        components = new ArrayList<>();
        assemblies = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void addAssembly(Assembly assembly) {
        assemblies.add(assembly);
    }

    public List<Component> getComponents() {
        return components;
    }

    public List<Assembly> getAssemblies() {
        return assemblies;
    }

    public void setOptimizationCompleted() {
        inProgress = false;
    }

    public boolean isOptimizingAssemblyPlan() {
        return inProgress;
    }
}
