package io.barblin.patterns.creational.abstractfactory;

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