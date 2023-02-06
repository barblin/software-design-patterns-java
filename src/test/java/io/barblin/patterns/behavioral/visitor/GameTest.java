package io.barblin.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    @Test
    void healthShouldRegenerateForAllCharacters() {
        Character[] characters = new Character[]{new Player(100), new Boss(2000)};

        HealthVisitor visitor = new RegenerativeHealthVisitor();
        for (Character character : characters) {
            character.inflictDamage(50);
            character.accept(visitor);
        }

        assertEquals(60, characters[0].getHealth());
        assertEquals(1970, characters[1].getHealth());
    }

    @Test
    void healthShouldNotRegenerateOverMaxHealth() {
        Character[] characters = new Character[]{new Player(100), new Boss(2000)};

        HealthVisitor visitor = new RegenerativeHealthVisitor();
        for (Character character : characters) {
            character.accept(visitor);
        }

        assertEquals(100, characters[0].getHealth());
        assertEquals(2000, characters[1].getHealth());
    }

    @Test
    void healthShouldNotDegradeBelowZero() {
        Character[] characters = new Character[]{new Player(100), new Boss(2000)};

        for (Character character : characters) {
            character.inflictDamage(2001);
        }

        assertEquals(0, characters[0].getHealth());
        assertEquals(0, characters[1].getHealth());
    }

    @Test
    void poisonedChaliceShouldReduceHealth() {
        Character[] characters = new Character[]{new Player(100), new Boss(2000)};

        HealthVisitor visitor = new PoisonedChaliceVisitor();
        for (Character character : characters) {
            character.accept(visitor);
        }

        assertEquals(20, characters[0].getHealth());
        assertEquals(1900, characters[1].getHealth());
    }
}