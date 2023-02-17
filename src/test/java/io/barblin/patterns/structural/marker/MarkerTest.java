package io.barblin.patterns.structural.marker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MarkerTest {

    @Test
    void shouldCheckCharactersForMarkers() {
        Character enemy = new Enemy();
        assertTrue(enemy instanceof Hostile);
        assertTrue(enemy instanceof NonPlayerCharacter);

        Character villager = new Villager();
        assertFalse(villager instanceof Hostile);
        assertTrue(villager instanceof NonPlayerCharacter);
    }
}