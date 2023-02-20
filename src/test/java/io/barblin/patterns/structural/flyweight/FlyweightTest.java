package io.barblin.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import static io.barblin.patterns.structural.flyweight.Asset.AssetType.SOUND_EFFECT;
import static io.barblin.patterns.structural.flyweight.Asset.AssetType.TEXTURE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyweightTest {

    @Test
    void getAssetShouldReturnFlyweightInstance() {
        Asset tex1 = AssetStore.get("tex1.dxt", TEXTURE);
        Asset tex2 = AssetStore.get("tex2.dxt", TEXTURE);
        Asset tex3 = AssetStore.get("tex1.dxt", TEXTURE);

        assertEquals(2, tex1.getInvocationCount());
        assertEquals(2, tex3.getInvocationCount());
        assertEquals(TEXTURE, tex1.getType());

        assertEquals(1, tex2.getInvocationCount());
        assertEquals(TEXTURE, tex2.getType());

        Asset sound = AssetStore.get("snd1.wav", SOUND_EFFECT);
        assertEquals(1, sound.getInvocationCount());
        assertEquals(SOUND_EFFECT, sound.getType());
        assertEquals("snd1.wav", sound.getName());
    }
}