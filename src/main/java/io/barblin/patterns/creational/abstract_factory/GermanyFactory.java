package io.barblin.patterns.creational.abstract_factory;

import io.barblin.patterns.creational.factory.GermanTranslator;
import io.barblin.patterns.creational.factory.Translator;

public record GermanyFactory() implements CountryFactory {
    @Override
    public Currency createCurrency() {
        return new EuroCurrency();
    }

    @Override
    public Translator createTranslator() {
        return new GermanTranslator();
    }
}
