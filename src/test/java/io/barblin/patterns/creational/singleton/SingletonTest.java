package io.barblin.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SingletonTest {

    @Test
    void shouldCreateSingleton() {
        assertNotNull(God.getInstance());
    }
}