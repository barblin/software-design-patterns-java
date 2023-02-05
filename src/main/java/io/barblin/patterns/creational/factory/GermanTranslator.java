package io.barblin.patterns.creational.factory;

final class GermanTranslator implements Translator {
    @Override
    public String sayHello() {
        return "Hallo";
    }

    @Override
    public String translate(String s) {
        return "German " + s;
    }
}
