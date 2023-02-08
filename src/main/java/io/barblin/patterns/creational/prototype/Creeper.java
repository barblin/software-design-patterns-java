package io.barblin.patterns.creational.prototype;

import java.util.Objects;

public final class Creeper extends Villain {

    private final int health;
    private final int hitDamage;
    private final int explosiveDamage;

    private Creeper(Creeper other) {
        this.health = other.health;
        this.hitDamage = other.hitDamage;
        this.explosiveDamage = other.explosiveDamage;
    }

    private Creeper(int health, int hitDamage, int explosiveDamage) {
        this.health = health;
        this.hitDamage = hitDamage;
        this.explosiveDamage = explosiveDamage;
    }

    public static Creeper create() {
        return new Creeper(80, 0, 200);
    }


    @Override
    public Villain clone() {
        return new Creeper(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creeper creeper = (Creeper) o;
        return health == creeper.health && hitDamage == creeper.hitDamage
                && explosiveDamage == creeper.explosiveDamage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, hitDamage, explosiveDamage);
    }
}
