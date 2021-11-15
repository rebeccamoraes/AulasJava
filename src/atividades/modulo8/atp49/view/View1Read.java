package atividades.modulo8.atp49.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View1Read {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT id, nome FROM categoria";

            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.execute();

            ResultSet result = pStatement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");

                System.out.println("---");
                System.out.printf("Id: %d\nNome: %s\n", id, nome);
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
