package io.barblin.patterns.behavioral.fluent_interface;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FluentInterfaceTest {

    @Test
    void fluentInterfaceShouldCreateBankAccount() {
        BankAccount account = new BankAccount()
                .withAccountNumber("11111")
                .withOwner("Jo P")
                .withBalance(BigDecimal.valueOf(10000.00));

        assertEquals("11111", account.getAccountNumber());
        assertEquals("Jo P", account.getOwner());
        assertEquals(BigDecimal.valueOf(10000.00), account.getBalance());
    }
}