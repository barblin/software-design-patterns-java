package io.barblin.patterns.creational.abstract_factory;

public record PoundCurrency() implements Currency {

    @Override
    public String getCode() {
        return "GBP";
    }

    @Override
    public char getSymbol() {
        return '£';
    }

    @Override
    public char getRadixPoint() {
        return '.';
    }
}