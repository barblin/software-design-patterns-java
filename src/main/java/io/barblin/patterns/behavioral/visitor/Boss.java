package io.barblin.patterns.behavioral.visitor;

public final class Boss extends Character {

    public Boss(int health) {
        super(health);
    }

    @Override
    void accept(HealthVisitor visitor) {
        visitor.visit(this);
    }
}
