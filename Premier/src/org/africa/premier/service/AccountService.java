package org.africa.premier.service;

import org.africa.premier.db.AccountRepository;
import org.africa.premier.dtos.TransferResponse;
import org.africa.premier.models.Account;

import java.math.BigDecimal;

public class AccountService {

    private Account sender;
    private Account recipient;

    private final AccountRepository accountRepository = new AccountRepository();

    public TransferResponse transfer(Account sender, Account recipient, BigDecimal amount) {
        TransferResponse response = new TransferResponse();
        sender = sender.setBalance(sender.getBalance().subtract(amount));
        recipient = recipient.setBalance(recipient.getBalance().add(amount));
        response.setMessage(response.getMessage());
        return response;
    }

    private Account save(Account account,Account sender,Account recipient) {
        sender = account.setAccountNumber("12345");
        Account senderPreviousBalance = account.setBalance(sender.getBalance());
        recipient = account.setAccountNumber("54321");
        Account recipientPreviousBalance = account.setBalance(recipient.getBalance());
        account.setBalance(sender.getBalance().subtract(recipient.getBalance()));
        return account;
    }
}
