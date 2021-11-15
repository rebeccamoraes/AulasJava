package atividades.modulo8.atp46.view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewRead {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "123456";
            
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement statement = conn.createStatement();

            String sql = "SELECT p.id, p.nome, p.descricao, p.preco, c.nome as categoria FROM produto p "
                + "INNER JOIN categoria c ON p.id_categoria = c.id";

            statement.execute(sql);

            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                Double preco = result.getDouble("preco");
                String categoria = result.getString("categoria");

                System.out.println("---");
                System.out.printf("Id: %d\nNome: %s\nDescrição: %s\nPreço: R$%.2f\nCategoria: %s\n", id, nome, descricao, preco, categoria);
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
