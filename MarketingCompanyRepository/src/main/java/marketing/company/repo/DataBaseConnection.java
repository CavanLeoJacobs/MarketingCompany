package marketing.company.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    //port must be included localhost:PORT here??????????
    /*private static final String JDBC_URL = "jdbc:mysql://localhost:8090/books_database?serverTimezone=UTC";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "test";

    //Connection URL	jdbc:sqlserver://localhost:1433;databaseName=PUBS
    //Database Name	PUBS
    //Driver Class	com.microsoft.sqlserver.jdbc.SQLServerDriver
    //Password	SQLServerPassword


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        } catch (SQLException e) {

            throw new RuntimeException ("Error connecting to database", e);
        }
        return connection;
    }


     */

}
