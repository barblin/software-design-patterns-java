package io.barblin.patterns.structural.proxy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SmartProxyTextureTest {

    @Test
    void lastAccessShouldReturnCorrectAccessTimes() throws InterruptedException {
        SmartProxyTexture texture = new SmartProxyTexture("file.txt", "1");
        assertEquals(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS),
                texture.lastInteraction().truncatedTo(ChronoUnit.SECONDS));
        assertEquals(texture.getLastUser(), "1");

        sleep(1000);

        texture.get("2");
        assertEquals(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS),
                texture.lastInteraction().truncatedTo(ChronoUnit.SECONDS));
        assertEquals("2", texture.getLastUser());

        List<String> userAccesses = texture.getAllUsers();
        assertTrue(userAccesses.contains("1"));
        assertTrue(userAccesses.contains("2"));
    }
}