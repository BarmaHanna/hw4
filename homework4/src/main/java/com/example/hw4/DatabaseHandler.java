package com.example.hw4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void signUpUser(String name, String address)
            throws SQLException, ClassNotFoundException {
        String insert = Const.USERS_TABLE + "(" + Const.USERS_NAME + "," + Const.USERS_ADDRESS + ")"
                + "VALUES(?,?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, name);
        prSt.setString(2, address);

        prSt.executeUpdate();
    }

    public void addAskMoney(String amount)
            throws SQLException, ClassNotFoundException {
        String insert = Const.TRANSACTIONS_TABLE + "(" + Const.TRANSACTIONS_AMOUNT + ")"
                + "VALUES(?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, amount);

        prSt.executeUpdate();
    }

}
