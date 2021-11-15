package atividades.modulo8.atp49.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String user = "postgres";
    private String password = "123456";

    public Connection getConnection() throws SQLException{
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
