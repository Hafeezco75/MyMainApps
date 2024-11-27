package org.africa.premier.db;

import java.sql.Connection;

public class DatabaseConnectionManager {
    private String username;
    private String password;

    public static Connection connection() {
        return null;
    }


    public DatabaseConnectionManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
