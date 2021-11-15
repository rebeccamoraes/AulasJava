package atividades.modulo8.atp48.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View3Update {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "UPDATE categoria SET nome=? WHERE id IN (SELECT id FROM categoria ORDER BY id ASC LIMIT 2)";
            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, "Top 2");
            pStatement.execute();

            int linhasAfetadas = pStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
