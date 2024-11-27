package org.africa.premier.db;

import org.africa.premier.dtos.TransferResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountRepository {
    private int currentId;

    public int Account(int id) {
        this.currentId = id;
        return currentId++;
    }

    public AccountRepository() {
    }

    public Connection transaction(PreparedStatement preparedStatement) {
        return null;
    }

    public void save(TransferResponse transferFunds) {
    }
}
