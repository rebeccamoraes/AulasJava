package aulas.modulo7.aula47.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import aulas.modulo7.aula47.model.Categoria;
import aulas.modulo7.aula47.utils.ConnectionFactory;

public class ViewInsert {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            Categoria categoria = new Categoria("Calçados");

            String sql = "INSERT INTO categoria (nome) VALUES (?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, categoria.getNome());

            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();
            
            while(ids.next()) {
                System.out.printf("ID: %d\n", ids.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
