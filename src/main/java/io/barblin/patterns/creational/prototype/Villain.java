package io.barblin.patterns.creational.prototype;

public abstract class Villain implements Cloneable {

    public abstract Villain clone();

    public enum VillainType {
        CREEPER,
        ZOMBIE
    }
}
