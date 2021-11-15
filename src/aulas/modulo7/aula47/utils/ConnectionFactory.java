package aulas.modulo7.aula47.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

// Links das bibliotecas utilizadas
// https://repo1.maven.org/maven2/com/mchange/c3p0/0.9.5.4/c3p0-0.9.5.4.jar
// https://repo1.maven.org/maven2/com/mchange/mchange-commons-java/0.2.15/mchange-commons-java-0.2.15.jar

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        pool.setUser("postgres");
        pool.setPassword("123456");
        pool.setMaxPoolSize(10);
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
