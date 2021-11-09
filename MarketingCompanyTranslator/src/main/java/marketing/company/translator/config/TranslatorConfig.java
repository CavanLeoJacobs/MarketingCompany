package marketing.company.translator.config;


import marketing.company.repo.config.RepositoryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.springframework.boot.SpringApplication.run;

@Import(RepositoryConfig.class)
@Configuration
@ComponentScan(basePackages =
        {
        "marketing.company.translator.impl" })
@SpringBootApplication
public class TranslatorConfig
{
   public TranslatorConfig()
    {

    }



}

