package com.example.a1javas3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/restaurant_database";
            String user = "Kritika200553441";
            String password = "QDqjVR-efn";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
