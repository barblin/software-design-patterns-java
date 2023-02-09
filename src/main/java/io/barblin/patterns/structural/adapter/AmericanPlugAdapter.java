package io.barblin.patterns.structural.adapter;

import java.util.stream.Stream;

public class AmericanPlugAdapter implements PlugTypeA {

    private final PlugTypeC plugTypeC;

    public AmericanPlugAdapter(PlugTypeC plugTypeC) {
        this.plugTypeC = plugTypeC;
    }

    @Override
    public void drain(Stream<Integer> stream) {
        plugTypeC.receive(stream);
    }
}
