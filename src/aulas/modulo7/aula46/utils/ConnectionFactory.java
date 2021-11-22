package aulas.modulo7.aula46.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String user = "postgres";
    private String password = "123456";
    private DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl(url);
        pool.setUser(user);
        pool.setPassword(password);
        pool.setMaxPoolSize(10);
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
