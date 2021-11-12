package atividades.atp46.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewCreate {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();

            String sql = "INSERT INTO produto (nome, descricao, preco, id_categoria) VALUES ('Notebook', 'Dell' , 4000, 4)";
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
