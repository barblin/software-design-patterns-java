package io.barblin.patterns.behavioral.chainofresponsibility;

public class Ticket {

    private Level level;

    private Ticket(Level level) {
        this.level = level;
    }

    enum Level {
        FIRST,
        SECOND,
        THIRD
    }

    public static Ticket of(Level level) {
        return new Ticket(level);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return this.level;
    }
}