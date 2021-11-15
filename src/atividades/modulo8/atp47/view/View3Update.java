package atividades.modulo8.atp47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View3Update {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement statement = conn.createStatement();
            String sql = "UPDATE categoria SET nome='top 2' WHERE id IN (SELECT id FROM categoria ORDER BY id ASC LIMIT 2)";
            statement.execute(sql);

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
