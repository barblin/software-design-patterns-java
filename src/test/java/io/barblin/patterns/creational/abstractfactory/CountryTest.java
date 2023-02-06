package io.barblin.patterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryTest {

    @Test
    void currentCountryShouldReturnEnglandData() {
        Country country = new Country(new EnglandFactory());

        assertEquals("£100.00", country.convertToString(100));
        assertEquals("£0.00", country.convertToString(0));
        assertEquals("£-1.00", country.convertToString(-1));
        assertEquals("£1.12", country.convertToString(1.123f));
        assertEquals("£1.13", country.convertToString(1.125f));

        assertTrue(country.translate("").startsWith("English"));
    }

    @Test
    void currentCountryShouldReturnGermanyData() {
        Country country = new Country(new GermanyFactory());

        assertEquals("€100,00", country.convertToString(100));
        assertEquals("€0,00", country.convertToString(0));
        assertEquals("€-1,00", country.convertToString(-1));
        assertEquals("€1,12", country.convertToString(1.123f));
        assertEquals("€1,13", country.convertToString(1.125f));

        assertEquals("EUR", country.getCurrencyCode());
        assertTrue(country.translate("").startsWith("German"));
    }
}