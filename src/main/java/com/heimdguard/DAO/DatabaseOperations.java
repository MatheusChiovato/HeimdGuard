package main.java.com.heimdguard.DAO;

import main.java.com.heimdguard.connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DatabaseOperations {

    public void insertUrl(String url) {

            String sql = "INSERT INTO visited_sites (url) VALUES(?)";
            try (Connection conn = main.java.com.heimdguard.connection.DatabaseConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)){

                    stmt.setString(1, url);
                    stmt.executeUpdate();
                    System.out.println("URL inserida com sucesso");
                
            } catch (SQLException e) {
                System.out.println("Erro ao inserir a URL: " + e.getMessage());
            }



    }



    
}
