package atividades.modulo8.atp49.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import atividades.modulo8.atp49.utils.ConnectionFactory;

public class View4Delete {
    public static void main(String[] args) {
        try {
            Connection conn = new ConnectionFactory().getConnection();

            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement pStatement = conn.prepareStatement(sql);
            int id = 20;
            pStatement.setInt(1, id);
            pStatement.execute();

            int linhasAfetadas = pStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
