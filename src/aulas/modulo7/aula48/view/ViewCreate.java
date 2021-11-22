package aulas.modulo7.aula48.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import atividades.modulo8.atp50.utils.ConnectionFactory;
import aulas.modulo7.aula48.model.Categoria;

public class ViewCreate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            Categoria model = new Categoria();
            model.setNome("Teste model insert");
            model.setDescricao("descricao");

            String sql = "INSERT INTO categoria (nome, descricao) VALUES (?, ?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.setString(2, model.getDescricao());

            prepStatement.execute();

            ResultSet ids = prepStatement.getResultSet();

            while (ids.next()) {
                System.out.println("ID: " + ids.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
