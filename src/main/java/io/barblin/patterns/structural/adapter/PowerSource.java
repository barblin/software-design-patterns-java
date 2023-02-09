package io.barblin.patterns.structural.adapter;

import java.util.stream.Stream;

public class PowerSource {

    public Stream<Integer> pour() {
        return Stream.of(1, 2, 3, 4, 5, 6);
    }
}
