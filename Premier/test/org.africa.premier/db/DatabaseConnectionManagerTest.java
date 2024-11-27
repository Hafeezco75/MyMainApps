package org.africa.premier.db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class DatabaseConnectionManagerTest {

    @Test
    public void testThatDatabaseCanConnect(){
        DatabaseConnectionManager connections = new DatabaseConnectionManager("root","Allahisone");
        String url = "jdbc:MySql@localhost:1521:";

//        try (Connection connection = ) {
//            connection.commit();
//        }catch (Exception exception){
//            exception.getMessage();

        //}
    }
}
