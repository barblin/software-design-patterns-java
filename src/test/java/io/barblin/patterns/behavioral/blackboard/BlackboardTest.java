package io.barblin.patterns.behavioral.blackboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackboardTest {

    @Test
    void runAgentShouldExecuteEachAgent() {
        Blackboard blackboard = new Blackboard();
        Agent componentAgent = new ComponentAgent(blackboard);
        Agent assemblyAgent = new AssemblyAgent(blackboard);
        Agent productionAgent = new ProductionAgent(blackboard);
        Agent optimizationAgent = new OptimizationAgent(blackboard);

        while (blackboard.isOptimizingAssemblyPlan()) {
            componentAgent.run();
            assemblyAgent.run();
            productionAgent.run();
            optimizationAgent.run();
        }

        // Find the optimized assembly plan
        // In this example we just check if the cycles created the expected components and assemblies
        assertEquals(3, blackboard.getComponents().size());
        assertEquals(3, blackboard.getAssemblies().size());
    }
}