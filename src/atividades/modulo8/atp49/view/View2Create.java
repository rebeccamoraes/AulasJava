package atividades.modulo8.atp49.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import atividades.modulo8.atp49.utils.ConnectionFactory;

public class View2Create {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "INSERT INTO categoria (nome) VALUES (?)";

            PreparedStatement pStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pStatement.setString(1, "Alimentos");

            pStatement.execute();

            ResultSet ids = pStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt(1);
                System.out.printf("Id: %d\n", id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
