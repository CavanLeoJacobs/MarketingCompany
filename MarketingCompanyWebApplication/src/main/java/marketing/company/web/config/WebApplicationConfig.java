package marketing.company.web.config;


import marketing.company.logic.config.LogicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;
/*
@Import(LogicConfig.class)
@Configuration
@ComponentScan(basePackages =
        {

                "marketing.company.web.controller",
                "marketing.company.web.exceptions",
        }
)
@PropertySource(value = "application.properties")
@PropertySource(value = "logback.xml")
@PropertySource(value = "webapp.WEB-INF.web.xml")
@SpringBootApplication

        public  WebApplicationConfig()
        {

              SpringApplication.run(LogicConfig.class);

        }


 */
public class WebApplicationConfig
{

}

