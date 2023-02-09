package io.barblin.patterns.structural.adapter;

import java.util.stream.Stream;

public interface PlugTypeA {

    void drain(Stream<Integer> stream);
}
