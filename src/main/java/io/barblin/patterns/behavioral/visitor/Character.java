package io.barblin.patterns.behavioral.visitor;

public abstract class Character {

    private final int maxHealth;
    private int health;

    protected Character(int health) {
        this.maxHealth = health;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int inflictDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }

        return this.health;
    }

    public void increaseHealth(int healthIncrement) {
        this.health += healthIncrement;
        if (this.maxHealth < this.health) {
            this.health = this.maxHealth;
        }
    }

    abstract void accept(HealthVisitor visitor);
}
