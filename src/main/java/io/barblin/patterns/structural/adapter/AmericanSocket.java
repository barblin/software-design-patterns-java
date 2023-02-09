package io.barblin.patterns.structural.adapter;

import java.util.Objects;

public class AmericanSocket {

    private PowerSource powerSource;
    private PlugTypeA americanPlug;

    public AmericanSocket(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    public void accept(PlugTypeA plug) {
        this.americanPlug = plug;
    }

    public boolean start() {
        if (Objects.isNull(americanPlug)) {
            return false;
        }
        americanPlug.drain(powerSource.pour());
        return true;
    }
}
