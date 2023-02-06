package io.barblin.patterns.creational.abstractfactory;

import io.barblin.patterns.creational.factory.EnglishTranslator;
import io.barblin.patterns.creational.factory.Translator;

public final class EnglandFactory implements CountryFactory {

    @Override
    public Currency createCurrency() {
        return new PoundCurrency();
    }

    @Override
    public Translator createTranslator() {
        return new EnglishTranslator();
    }
}
