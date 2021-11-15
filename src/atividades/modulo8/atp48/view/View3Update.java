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

            String sql = "UPDATE categoria SET nome= ? WHERE nome = ?";
            PreparedStatement pStatement = conn.prepareStatement(sql);
            String nomeAntigo = "Alimentos";
            String nomeNovo = "Comidas";
            pStatement.setString(1, nomeNovo);
            pStatement.setString(2, nomeAntigo);
            pStatement.execute();

            int linhasAfetadas = pStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
