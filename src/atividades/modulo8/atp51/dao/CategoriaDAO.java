package atividades.modulo8.atp51.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import atividades.modulo8.atp51.utils.ConnectionFactory;

import atividades.modulo8.atp51.model.Categoria;

public class CategoriaDAO {
    public void create() {

    }

    public ArrayList<Categoria> read() {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "SELECT id, nome, descricao FROM categoria";

            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.execute();

            ResultSet result = pStatement.getResultSet();

            while (result.next()) {
                Categoria categoria = new Categoria();
                
                categoria.setId(result.getInt("id"));
                categoria.setNome(result.getString("nome"));
                categoria.setDescricao(result.getString("descricao"));

                list.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void update() {

    }

    public void delete() {

    }

}
