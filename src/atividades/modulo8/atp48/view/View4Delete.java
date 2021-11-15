package atividades.modulo8.atp48.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View4Delete {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM categoria WHERE id IN(SELECT id FROM categoria ORDER BY id DESC LIMIT 2)";
            PreparedStatement pStatement = conn.prepareStatement(sql);
            
            pStatement.execute();

            int linhasAfetadas = pStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
