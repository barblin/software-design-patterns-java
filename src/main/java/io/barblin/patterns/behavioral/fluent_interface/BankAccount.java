package io.barblin.patterns.behavioral.fluent_interface;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private BigDecimal balance;

    public BankAccount withAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public BankAccount withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public BankAccount withBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}