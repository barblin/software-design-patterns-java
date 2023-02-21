package io.barblin.patterns.creational.abstract_factory;

import io.barblin.patterns.creational.factory.Translator;

public interface CountryFactory {
    Currency createCurrency();

    Translator createTranslator();
}
