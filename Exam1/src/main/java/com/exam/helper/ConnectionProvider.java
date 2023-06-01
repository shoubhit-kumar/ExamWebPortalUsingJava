package com.exam.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null) {//run the following block when no coonection is established before
                //driver class load
                Class.forName("com.mysql.jdbc.Driver");

                //create a connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oewp", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
