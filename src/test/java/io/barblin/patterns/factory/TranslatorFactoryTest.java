package io.barblin.patterns.factory;

import io.barblin.patterns.creational.factory.Translator;
import io.barblin.patterns.creational.factory.TranslatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TranslatorFactoryTest {

    private final TranslatorFactory factory = new TranslatorFactory();

    @Test
    void createTranslatorShouldReturnFrenchTranslator() {
        Translator translator = factory.create(TranslatorFactory.Language.FRENCH);

        assertEquals("Bonjour", translator.sayHello());
        assertTrue(translator.translate("").startsWith("French"));
    }

    @Test
    void createTranslatorShouldReturnGermanTranslator() {
        Translator translator = factory.create(TranslatorFactory.Language.GERMAN);

        assertEquals("Hallo", translator.sayHello());
        assertTrue(translator.translate("").startsWith("German"));
    }

    @Test
    void createTranslatorShouldReturnEnglishTranslator() {
        Translator translator = factory.create(TranslatorFactory.Language.ENGLISH);

        assertEquals("Hello", translator.sayHello());
        assertTrue(translator.translate("").startsWith("English"));
    }

    @Test
    void createTranslatorShouldReturnEnglishTranslatorByDefault() {
        Translator translator = factory.create(null);

        assertEquals("Hello", translator.sayHello());
        assertTrue(translator.translate("").startsWith("English"));
    }
}