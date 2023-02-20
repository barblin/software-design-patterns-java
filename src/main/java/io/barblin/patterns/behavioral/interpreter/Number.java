package io.barblin.patterns.behavioral.interpreter;

public record Number(int value) implements Expression {
    @Override
    public int interpret() {
        return value;
    }
}
