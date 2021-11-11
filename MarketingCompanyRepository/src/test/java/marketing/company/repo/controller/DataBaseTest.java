package marketing.company.repo.controller;

import org.junit.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.junit.Assert.*;
@EnableTransactionManagement
@EntityScan("marketing.company.domain.persistence")
@EnableJpaRepositories("marketing.company.repo.persistence")
public class DataBaseTest
{
DataBase data =new DataBase();
    private static final String[] ENTITY_PACKAGES_TO_SCAN = {"marketing.company.domain.persistence"};
    private static final String PERSISTENCE_UNIT_NAME = "marketing.company.persistence";



    @Test
    void TestingDataBaseMethods()
    {
        data.entityManagerFactory();
    }
}