package io.barblin.patterns.behavioral.blackboard;

public abstract class Agent {
    protected final Blackboard blackboard;

    public Agent(Blackboard blackboard) {
        this.blackboard = blackboard;
    }

    public abstract void run();
}
