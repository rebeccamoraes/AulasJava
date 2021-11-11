package modulo7.aula45.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

            Statement statement = conn.createStatement();

            statement.execute("SELECT * FROM produto");

            ResultSet rs = statement.getResultSet();

            while(rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                System.out.printf("%d  - %s : %s\n", id, nome, descricao);
            }

            conn.close();
        } catch (SQLException e) {
            //System.out.println("Não foi possível se conectar.");
            e.printStackTrace();
        }

    }
}