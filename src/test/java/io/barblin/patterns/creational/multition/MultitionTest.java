package io.barblin.patterns.creational.multition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MultitionTest {

    @Test
    void shouldGetNorseGods() {
        assertNotNull(NorseGod.getGod(NorseGod.NorseGodEnum.ODIN));
        assertNotNull(NorseGod.getGod(NorseGod.NorseGodEnum.THOR));
        assertNotNull(NorseGod.getGod(NorseGod.NorseGodEnum.FREYJA));
    }
}