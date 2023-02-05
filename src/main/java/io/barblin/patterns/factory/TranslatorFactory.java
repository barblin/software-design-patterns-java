package io.barblin.patterns.factory;

import java.util.Objects;

public class TranslatorFactory {

    public enum Language {
        ENGLISH,
        FRENCH,
        GERMAN
    }

    public Translator create(Language language) {
        if (Objects.isNull(language)) {
            return new EnglishTranslator();
        }

        return switch (language) {
            case FRENCH -> new FrenchTranslator();
            case GERMAN -> new GermanTranslator();
            default -> new EnglishTranslator();
        };
    }
}
