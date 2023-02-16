package io.barblin.patterns.structural.flyweight;

public final class SoundEffect extends Asset {

    protected SoundEffect(String name) {
        super(name);
    }

    @Override
    public AssetType getType() {
        return AssetType.SOUND_EFFECT;
    }
}
