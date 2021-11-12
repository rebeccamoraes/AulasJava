package modulo7.aula47.view;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modulo7.aula47.model.Categoria;
import modulo7.aula47.utils.ConnectionFactory;

public class ViewUpdate {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            Categoria categoria = new Categoria(8, "UpdatePrepStatement");

            String sql = "UPDATE categoria SET nome = ? WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, categoria.getNome());
            prepStatement.setInt(2, categoria.getId());

            prepStatement.execute();

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
