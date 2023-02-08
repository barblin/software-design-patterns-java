package io.barblin.patterns.creational.multition;

import java.util.EnumMap;

public class NorseGod {

    public enum NorseGodEnum {
        ODIN,
        THOR,
        FREYJA
    }

    private static final EnumMap<NorseGodEnum, NorseGod> norseGods = new EnumMap(NorseGodEnum.class);

    private NorseGod() {
    }

    public static NorseGod getGod(NorseGodEnum godKey) {
        return norseGods.computeIfAbsent(godKey, k -> new NorseGod());
    }
}
