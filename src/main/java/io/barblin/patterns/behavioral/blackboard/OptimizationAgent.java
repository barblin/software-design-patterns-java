package io.barblin.patterns.behavioral.blackboard;

public class OptimizationAgent extends Agent {

    private int cycles = 0;

    public OptimizationAgent(Blackboard blackboard) {
        super(blackboard);
    }

    public void run() {
        // Analyze the production data and generate optimized assembly plans
        cycles++;

        if (3 <= cycles) {
            blackboard.setOptimizationCompleted();
        }

    }
}