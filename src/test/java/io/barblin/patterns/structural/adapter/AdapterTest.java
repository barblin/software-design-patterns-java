package io.barblin.patterns.structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdapterTest {

    @Test
    void europeanPlugShouldReceiveValues() {
        PlugTypeC plugMock = stream -> {
            System.out.println(stream.collect(Collectors.toList()));
            assertNotNull(stream);
        };

        AmericanSocket americanSocket = new AmericanSocket(new PowerSource());
        americanSocket.accept(new AmericanPlugAdapter(plugMock));
        assertTrue(americanSocket.start());
    }
}