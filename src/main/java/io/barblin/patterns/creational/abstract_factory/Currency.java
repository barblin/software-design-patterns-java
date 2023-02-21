package io.barblin.patterns.creational.abstract_factory;

public sealed interface Currency permits PoundCurrency, EuroCurrency {

    String getCode();

    char getSymbol();

    char getRadixPoint();
}
