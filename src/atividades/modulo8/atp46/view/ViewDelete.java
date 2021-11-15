package atividades.modulo8.atp46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewDelete {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement statement = conn.createStatement();
            String sql = "DELETE FROM produto where id > 15";
            statement.execute(sql);

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
