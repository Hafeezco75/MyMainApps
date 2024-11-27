package org.africa.premier.service;

import org.africa.premier.db.AccountRepository;
import org.africa.premier.models.Account;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {

    public final AccountService accountService = new AccountService();

    private final AccountRepository accountRepos = new AccountRepository();

    @Test
    public void testTransferFunds() {
        Account sender = new Account("54321", new BigDecimal("10000.00"));
        sender.setId(sender.getId());
        var senderPreviousBalance = sender.getBalance();
        Account recipient = new Account("54321", new BigDecimal("5000.00"));
        recipient.setAccountNumber(sender.getAccountNumber());
        var receiverPreviousBalance = recipient.getBalance();
        var transferAmount = new BigDecimal("3000.00");
        var transactionSender = senderPreviousBalance.subtract(transferAmount);
        var transactionRecipient = receiverPreviousBalance.add(transferAmount);
        var transferFunds = accountService.transfer(sender,recipient,transferAmount);
        accountRepos.save(transferFunds);
        BigDecimal senderExpected = sender.getBalance();
        assertEquals(senderExpected, senderPreviousBalance);
        BigDecimal recipientExpected = recipient.getBalance();
        assertEquals(recipientExpected, receiverPreviousBalance);
    }


}
