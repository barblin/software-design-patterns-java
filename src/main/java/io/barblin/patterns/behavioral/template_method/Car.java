package io.barblin.patterns.behavioral.template_method;

public record Car(int oilLevel, int oilQuality, int filterQuality, int profileDepth) implements Vehicle {
    @Override
    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public int getOilQuality() {
        return oilQuality;
    }

    @Override
    public int getFilterQuality() {
        return filterQuality;
    }

    @Override
    public int getTireProfileDepth() {
        return profileDepth;
    }
}
