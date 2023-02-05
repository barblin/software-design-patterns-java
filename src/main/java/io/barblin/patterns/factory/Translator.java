package io.barblin.patterns.factory;

public sealed interface Translator permits EnglishTranslator, FrenchTranslator, GermanTranslator {

    String sayHello();

    String translate(String s);
}
