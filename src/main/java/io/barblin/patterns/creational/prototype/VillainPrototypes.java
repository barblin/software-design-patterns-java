package io.barblin.patterns.creational.prototype;

import java.util.EnumMap;

public class VillainPrototypes {
    private EnumMap<Villain.VillainType, Villain> cache = new EnumMap<>(Villain.VillainType.class);

    public VillainPrototypes() {
        cache.put(Villain.VillainType.ZOMBIE, Zombie.create());
    }

    public Villain put(Villain.VillainType type, Villain villain) {
        cache.put(type, villain);
        return villain;
    }

    public Villain get(Villain.VillainType type) {
        return cache.get(type).clone();
    }
}
