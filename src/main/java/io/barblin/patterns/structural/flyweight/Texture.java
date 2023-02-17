package io.barblin.patterns.structural.flyweight;

public final class Texture extends Asset {
    public Texture(String name) {
        super(name);
    }

    @Override
    public AssetType getType() {
        return AssetType.TEXTURE;
    }
}
