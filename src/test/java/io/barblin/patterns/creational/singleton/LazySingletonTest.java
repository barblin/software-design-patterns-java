package io.barblin.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LazySingletonTest {

    @Test
    void shouldCreateSingleton() {
        assertNotNull(LazySingleton.getInstance());
    }
}