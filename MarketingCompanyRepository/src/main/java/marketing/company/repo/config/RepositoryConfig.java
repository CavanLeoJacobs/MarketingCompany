package marketing.company.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan(basePackages = {
        "marketing.company.repo.controller",
        "marketing.company.repo.exceptions",
        "marketing.company.repo.persistence"})
@EnableJpaRepositories("marketing.company.repo.persistence")
@EntityScan("marketing.company.domain.persistence")
@PropertySource(value = "classpath:DataBase.properties")
public class RepositoryConfig
{
   public RepositoryConfig()
    {

    }
    public void GetAllRepositoryConfig()
    {

    }

  // countable noun.
    // The config of a computer system is the way in which all its parts,
    // such as the hardware and software, are connected together in order for the computer to work.
    // Config is short for ' configuration'.





}
