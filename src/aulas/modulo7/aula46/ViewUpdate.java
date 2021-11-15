package aulas.modulo7.aula46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {
    public static void main(String[] args) {
        try {
            int id = 8;
            String nome = "UpdatePRepStatement";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            

            String sql = "UPDATE categoria SET nome=? WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, nome);
            statement.setInt(2, id);

            statement.execute();

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
