package modulo7.aula46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Usando prepared statemente para prevenir sql injection.
 */
public class ViewInsert {
    public static void main(String[] args) {
        try {
            String nome = "Eletro');delete from categoria; INSERT INTO categoria(nome) values('otario";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO categoria (nome) values (?)");
            ps.setString(1, nome);

            ps.execute();
            ResultSet ids = ps.getGeneratedKeys();

            while(ids.next()) {
                int id = ids.getInt("id");
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
}
