package io.barblin.patterns.behavioral.blackboard;

public class AssemblyAgent extends Agent {
    public AssemblyAgent(Blackboard blackboard) {
        super(blackboard);
    }

    public void run() {
        // Generate possible assembly plans and add them to the blackboard
        blackboard.addAssembly(new Assembly());
    }
}