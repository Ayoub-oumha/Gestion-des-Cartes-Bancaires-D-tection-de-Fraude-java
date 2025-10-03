package dao;

import entity.Client;

import java.sql.PreparedStatement;

public class ClientDAO {
    private DatabaseConnection databaseConnection;
    public ClientDAO(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }
    public void create(Client client){
        String sql = "INSERT INTO client (id , nom , email , telephone ) VALUES (? , ? , ? , ?)" ;
        try (PreparedStatement stmt = databaseConnection.)
    }
}
