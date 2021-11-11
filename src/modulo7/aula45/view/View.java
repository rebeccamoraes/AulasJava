package modulo7.aula45.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View {
    public static void main(String[] args) {
        String driverType = "jdbc";
        String driverName = "postgresql";
        String host = "localhost";
        int port  = 5432;
        String database = "postgres";

        String user = "postgres";
        String pwd = "123456";

        String connectionString = String.format("%s:%s://%s:%s/%s", driverType, driverName, host, port, database);
        
        try {
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível se conectar.");
        }

    }
}