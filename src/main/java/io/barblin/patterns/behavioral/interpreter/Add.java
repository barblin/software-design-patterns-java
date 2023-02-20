package io.barblin.patterns.behavioral.interpreter;

public record Add(Expression left, Expression right) implements Expression {
    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
