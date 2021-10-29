package marketing.company.repo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    //private static String JDBC_URL = "jdbc:mysql://localhost:3306/MarketingDatabase";
    //private static final String JDBC_UserName = "root";
    //private static final String JDBC_PassWord = "test";
/*
    //Connection URL	jdbc:sqlserver://localhost:1433;databaseName=PUBS
    //Database Name	PUBS
    //Driver Class	com.microsoft.sqlserver.jdbc.SQLServerDriver
    //Password	SQLServerPassword


    public static Connection getConnection()
     {

        Connection connection = null;
        try {

            connection = DriverManager.getConnection( JDBC_URL,JDBC_UserName, JDBC_PassWord);
        }
        catch (SQLException e) {
        //catch (Exception e) {
         System.out.println(e.getMessage());
            throw new RuntimeException ("Error connecting to database", e);


        }
        return connection;
    }

*/


}
