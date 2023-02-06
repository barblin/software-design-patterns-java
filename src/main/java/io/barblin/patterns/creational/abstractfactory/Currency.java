package io.barblin.patterns.creational.abstractfactory;

public sealed interface Currency permits PoundCurrency, EuroCurrency {

    String getCode();

    char getSymbol();

    char getRadixPoint();
}
