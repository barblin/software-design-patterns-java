package io.barblin.patterns.creational.abstractfactory;

import java.math.BigDecimal;

public class Country {

    private final CountryFactory factory;

    public Country(CountryFactory factory) {
        this.factory = factory;
    }

    String convertToString(float price) {
        BigDecimal bigDecimalPrice = new BigDecimal(price).setScale(2, BigDecimal.ROUND_HALF_UP);
        Currency currency = factory.createCurrency();
        String formattedPrice = bigDecimalPrice.toString().replace('.', currency.getRadixPoint());
        return currency.getSymbol() + formattedPrice;
    }

    String getCurrencyCode() {
        return factory.createCurrency().getCode();
    }

    String translate(String s) {
        return factory.createTranslator().translate(s);
    }
}
