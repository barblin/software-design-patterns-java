package io.barblin.patterns.creational.factory;

final class FrenchTranslator implements Translator {
    @Override
    public String sayHello() {
        return "Bonjour";
    }

    @Override
    public String translate(String s) {
        return "French " + s;
    }
}
