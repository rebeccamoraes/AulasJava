package modulo7.aula47.view;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modulo7.aula47.utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            int idDeletado = 10;

            String sql = "DELETE FROM categoria WHERE id = ?";

            try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute();

                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
