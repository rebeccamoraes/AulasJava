package atividades.modulo8.atp49.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import atividades.modulo8.atp49.utils.ConnectionFactory;

public class View3Update {
    public static void main(String[] args) {
        try {
            Connection conn = new ConnectionFactory().getConnection();

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
