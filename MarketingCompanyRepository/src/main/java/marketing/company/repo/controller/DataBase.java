package marketing.company.repo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;
@EnableTransactionManagement
@EntityScan("marketing.company.domain.persistence")
@EnableJpaRepositories("marketing.company.repo.persistence")

public class DataBase {


// not in here put properties in DataBase.properties because @PropertySource(value = "classpath:DataBase.properties")
// in the RepositoryConfig
    // MAYBE

    private static final String[] ENTITY_PACKAGES_TO_SCAN = {"marketing.company.domain.persistence"};
    private static final String PERSISTENCE_UNIT_NAME = "marketing.company.persistence";


    public DataBase() {
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        //entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan(ENTITY_PACKAGES_TO_SCAN);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
       // entityManagerFactoryBean.setJpaProperties(JpaProperties());
        entityManagerFactoryBean.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
        return entityManagerFactoryBean;
    }
    @Bean
    public PlatformTransactionManager transactionManager() {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
/*

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.HSQL)
                .addScript("script/schema.sql")
                .addScript("script/data.sql")
                .build();
    }
@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");

        try {
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setUrl(datasourceUrl);
            //dataSource.setImplicitCachingEnabled(true);
            //dataSource.setFastConnectionFailoverEnabled(true);

            return dataSource;

        } catch (Exception error) {

            throw new RuntimeException("Unable to connect to DB", error);
        }
    @Bean
    public Properties buildJpaProperties() {

        Properties properties = new Properties();
       properties.setProperty("javax.persistence.transactionType", "jta");
        properties.setProperty("hibernate.IntegerCode.use_reflection_optimizer", "true");
        properties.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JTATransactionFactory");
        properties.setProperty("hibernate.query.factory_class", "org.hibernate.hql.internal.classic.ClassicQueryTranslatorFactory");
        properties.setProperty("hibernate.transaction.jta.platform", "org.hibernate.service.jta.platform.Internal.sunOneJtaPlatform");

        //properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        //mine is different
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        properties.setProperty("hibernate.generate_statistics", "false");
        properties.setProperty("hibernate.use_sql_comments", "false");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.jdbc.batch_size", "500");
        properties.setProperty("hibernate.order_inserts", "true");
        properties.setProperty("hibernate.order_updates", "true");
        properties.setProperty("hibernate.batch_versioned_data", "true");
        properties.setProperty("hibernate.connection.driver.class", "org.hsqldb.jdbcDriver");
        properties.setProperty("hibernate.hibernate.", "update");



        return properties;
    }


    @Value("${spring.datasource.url}")
    private String datasourceUrl="jdbc:mysql://localhost/MarketingCompany";
    @Value("${spring.datasource.username}")
    private String username="root";
    @Value("${spring.datasource.password}")
    private String password="root";





 @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder.setType(EmbeddedDatabaseType.HSQL)
                .addScript("script/schema.sql")
                .addScript("script/data.sql")
                .build();
    }




    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");

       try {
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setUrl(datasourceUrl);
            dataSource.setImplicitCachingEnabled(true);
            dataSource.setFastConnectionFailoverEnabled(true);

            return dataSource;

        } catch (SQLException error) {

            throw new RuntimeException("Unable to connect to DB", error);
        }

    }
}

 */

}