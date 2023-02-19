package io.barblin.patterns.behavioral.blackboard;

public class ComponentAgent extends Agent {
    public ComponentAgent(Blackboard blackboard) {
        super(blackboard);
    }

    public void run() {
        // Generate possible component designs and add them to the blackboard
        blackboard.addComponent(new Component());
    }
}
