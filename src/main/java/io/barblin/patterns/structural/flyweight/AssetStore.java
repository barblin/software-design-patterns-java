package io.barblin.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class AssetStore {

    private static final Map<String, Asset> assetMap = new HashMap<>();

    private AssetStore() {
    }

    public static Asset get(String identifier, Asset.AssetType type) {
        if (Objects.isNull(identifier) || Objects.isNull(type)) {
            throw new IllegalArgumentException("identifier or type may not be null");
        }

        Asset asset = switch (type) {
            case TEXTURE -> assetMap.computeIfAbsent(identifier, k -> new Texture(identifier));
            case SOUND_EFFECT -> assetMap.computeIfAbsent(identifier, k -> new SoundEffect(identifier));
        };

        asset.incrementInvocationCount();
        return asset;
    }
}
