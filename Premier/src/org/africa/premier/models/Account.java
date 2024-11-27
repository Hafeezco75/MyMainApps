package org.africa.premier.models;

import java.math.BigDecimal;

public class Account {
    private int id;
    private String accountNumber;
    private BigDecimal balance;


    public Account(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return null;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Account setBalance(BigDecimal balance) {
        this.balance = balance;
        return null;
    }
}
