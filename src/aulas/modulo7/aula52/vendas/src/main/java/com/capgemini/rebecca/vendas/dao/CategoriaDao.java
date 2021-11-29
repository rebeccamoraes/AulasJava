package com.capgemini.rebecca.vendas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.capgemini.rebecca.vendas.models.Categoria;

public class CategoriaDao {
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

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria ORDER BY id ASC");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Categoria model = new Categoria();                
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }

    /**
     * Busca lista das categorias cadastradas no banco de dados que contenha o nome passado
     * 
     * @param nome: nome a ser filtrado
     * @return ArrayList: lista de categorias
     */
    public ArrayList<Categoria> read(String nome) {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria WHERE nome = ? ORDER BY nome");
            prepStatement.setString(1, nome);

            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Categoria model = new Categoria();                
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    /**
     * Busca uma categoria com base no id
     * 
     * @param id: id da categoria
     * @return ArrayList: lista de categorias
     */
    public Categoria readById(int id) {
        Categoria categoria = new Categoria();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria WHERE id = ? ORDER BY id DESC");
            prepStatement.setInt(1, id);

            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            
            result.next();               
            categoria.setId(result.getInt("id"));
            categoria.setNome(result.getString("nome"));
            categoria.setDescricao(result.getString("descricao"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return categoria;
    }

/**
 * Atualiza dados de uma categoria
 * 
 * @param categoria Categoria a ser atualizada
 */
    public int update(Categoria categoria) {
        int linhasAfetadas = 0;

        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "UPDATE categoria SET nome = ?, descricao = ? WHERE id = ?";
            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, categoria.getNome());
            pStatement.setString(2, categoria.getDescricao());
            pStatement.setInt(3, categoria.getId());
            pStatement.execute();

            linhasAfetadas = pStatement.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return linhasAfetadas;
    }

    /**
     * Exclui uma categoria
     * 
     * @param categoria
     */
    public int delete(Categoria categoria) {
        int linhasAfetadas = 0;
        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.setInt(1, categoria.getId());
            pStatement.execute();

            linhasAfetadas = pStatement.getUpdateCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhasAfetadas;
    }
}
