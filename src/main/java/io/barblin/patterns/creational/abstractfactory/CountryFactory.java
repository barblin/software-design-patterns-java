package io.barblin.patterns.creational.abstractfactory;

import io.barblin.patterns.creational.factory.Translator;

public interface CountryFactory {
    Currency createCurrency();

    Translator createTranslator();
}
