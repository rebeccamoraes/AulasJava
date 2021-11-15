package atividades.modulo8.atp49.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aulas.modulo7.aula47.utils.ConnectionFactory;

public class View1Read {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
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
