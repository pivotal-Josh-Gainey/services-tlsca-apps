package com.jgainey.mysqlkbvid.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Looper {

    String jbdcUri;
    int i = 3;

    public void start() {
        CredGetterVCAP getter = new CredGetterVCAP();
        getter.setup();
        jbdcUri = getter.getjdbcUri();
        Utils.logInfo("JOSH - " + jbdcUri);
        initConnection();
    }

    private void initConnection() {
        try {
            Connection connection = DriverManager.getConnection(jbdcUri);
            System.out.println("Connection good");
            Statement statement = connection.createStatement();
            statement.executeUpdate("create table if not exists testtable4 (_id int NOT NULL AUTO_INCREMENT primary key, _word varchar(255));");
            messageLoop(statement);
        } catch (SQLException e) {
            Utils.logError("called in initconnection");
            Utils.logError(e.getMessage());
            e.printStackTrace();
            ascendConnect();
        }
    }

    private void ascendConnect() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Utils.logError("called in ascend-connect");
            Utils.logError(e.getMessage());
            e.printStackTrace();
        }
        initConnection();
    }

    private void messageLoop(Statement statement) {
        try {
            Thread.sleep(5000);
            Utils.logInfo("Connection active - message sent at " + System.currentTimeMillis());
            statement.executeUpdate("insert into testtable4 (_word) values ('josh');");
            messageLoop(statement);
        }catch (Exception e){
            Utils.logError("called in messageloop");
            Utils.logError(e.getMessage());
            e.printStackTrace();
            ascendConnect();
        }
    }
}
