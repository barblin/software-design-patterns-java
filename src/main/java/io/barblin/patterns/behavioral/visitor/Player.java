package io.barblin.patterns.behavioral.visitor;

public final class Player extends Character {

    protected Player(int health) {
        super(health);
    }

    @Override
    void accept(HealthVisitor visitor) {
        visitor.visit(this);
    }
}
