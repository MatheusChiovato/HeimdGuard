package main.java.com.heimdguard.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/heimdguard";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";


    public static java.sql.Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
