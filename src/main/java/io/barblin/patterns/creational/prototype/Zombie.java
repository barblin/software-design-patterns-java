package io.barblin.patterns.creational.prototype;

import java.util.Objects;

final class Zombie extends Villain {

    private int health;
    private int hitDamage;
    private int speed;

    private Zombie(Zombie other) {
        this.health = other.health;
        this.hitDamage = other.hitDamage;
        this.speed = other.speed;
    }

    private Zombie(int health, int hitDamage, int speed) {
        this.health = health;
        this.hitDamage = hitDamage;
        this.speed = speed;
    }

    public static Zombie create() {
        return new Zombie(100, 20, 50);
    }

    @Override
    public Villain clone() {
        return new Zombie(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zombie zombie = (Zombie) o;
        return health == zombie.health && hitDamage == zombie.hitDamage && speed == zombie.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, hitDamage, speed);
    }
}

