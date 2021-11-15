package atividades.modulo8.atp47.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View2Create {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();

            String sql = "INSERT INTO categoria (nome) VALUES ('Alimentos')";
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet ids = statement.getGeneratedKeys();

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
