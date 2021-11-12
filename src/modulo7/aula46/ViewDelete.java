package modulo7.aula46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewDelete {
    public static void main(String[] args) {
        try {
            int id = 9;
    
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
    
            String sql = "DELETE FROM categoria WHERE id = ?";
    
            PreparedStatement statement = conn.prepareStatement(sql);
    
            statement.setInt(1, id);
    
            statement.execute();
    
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
    
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
