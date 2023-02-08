package io.barblin.patterns.creational.singleton;

public class God {
    private static God instance;

    private God() {}

    public static God getInstance() {
        if (instance == null) {
            instance = new God();
        }
        return instance;
    }
}