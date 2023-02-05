package io.barblin.patterns.creational.factory;

public sealed interface Translator permits EnglishTranslator, FrenchTranslator, GermanTranslator {

    String sayHello();

    String translate(String s);
}
