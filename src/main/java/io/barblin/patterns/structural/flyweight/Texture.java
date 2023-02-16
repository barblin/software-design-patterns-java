package io.barblin.patterns.structural.flyweight;

public final class Texture extends Asset {
    protected Texture(String name) {
        super(name);
    }

    @Override
    public AssetType getType() {
        return AssetType.TEXTURE;
    }
}
