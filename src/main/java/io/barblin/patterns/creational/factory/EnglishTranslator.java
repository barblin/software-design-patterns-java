package io.barblin.patterns.creational.factory;

public final class EnglishTranslator implements Translator {
    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String translate(String s) {
        return "English " + s;
    }
}
