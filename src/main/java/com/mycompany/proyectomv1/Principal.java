package com.mycompany.proyectomv1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/testing?user=postgres&password=root";
        try (Connection conn = DriverManager.getConnection(url)) {

            Logger.getLogger(Principal.class.getName()).log(Level.INFO, conn.getCatalog());
        } catch (SQLException e) {
            Logger.getLogger(Principal.class.getName()).log(Level.INFO, "There was an error", e);
        }
    }
}
