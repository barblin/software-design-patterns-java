package io.barblin.patterns.creational.abstract_factory;

public record EuroCurrency() implements Currency {
    @Override
    public String getCode() {
        return "EUR";
    }

    @Override
    public char getSymbol() {
        return '€';
    }

    @Override
    public char getRadixPoint() {
        return ',';
    }
}
