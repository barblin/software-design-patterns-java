package io.barblin.patterns.structural.flyweight;

public abstract class Asset {

    private final String name;
    private int invocations;

    protected Asset(String name) {
        this.name = name;
        this.invocations = 0;
    }

    enum AssetType {
        TEXTURE,
        SOUND_EFFECT
    }

    abstract AssetType getType();

    public String getName() {
        return name;
    }

    public int getInvocationCount() {
        return invocations;
    }

    public void incrementInvocationCount() {
        this.invocations++;
    }
}