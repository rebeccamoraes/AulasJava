package atividades.modulo8.atp51.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import atividades.modulo8.atp51.utils.ConnectionFactory;

import atividades.modulo8.atp51.model.Categoria;

public class CategoriaDAO {
    /**
     * Cria uma nova categoria e salva no banco de dados
     */
    public int create(Categoria categoria) {
        int idGerado = 0;

        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "INSERT INTO categoria (nome, descricao) VALUES (?, ?)";

            PreparedStatement pStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pStatement.setString(1, categoria.getNome());
            pStatement.setString(2, categoria.getDescricao());

            pStatement.execute();

            ResultSet ids = pStatement.getGeneratedKeys();

            while (ids.next()) {
                idGerado = ids.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idGerado;
    }

    /**
     * Busca lista das categorias cadastradas no banco de dados
     * 
     * @return ArrayList: lista de categorias
     */
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
