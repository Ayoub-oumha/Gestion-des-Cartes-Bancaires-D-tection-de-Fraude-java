package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/cart_bancair";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Méthode pour récupérer une connexion
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("✅ Connexion réussie !");
            return connection;
        } catch (SQLException e) {
            System.out.println("❌ Erreur de connexion à la base de données :" + e.getMessage());
            //e.printStackTrace();
        }
        return null;
    }
}
