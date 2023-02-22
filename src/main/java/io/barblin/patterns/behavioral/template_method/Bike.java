package io.barblin.patterns.behavioral.template_method;

public record Bike(int oilQuality, int profileDepth, int chainQuality) implements Vehicle {

    @Override
    public int getOilLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getOilQuality() {
        return oilQuality;
    }

    @Override
    public int getFilterQuality() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getTireProfileDepth() {
        return profileDepth;
    }
}
