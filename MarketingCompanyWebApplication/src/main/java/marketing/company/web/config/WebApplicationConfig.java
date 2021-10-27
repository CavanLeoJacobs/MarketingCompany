package marketing.company.web.config;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@Configuration
@ComponentScan(basePackages =
        {
                "marketing.company.web.controller",
                "marketing.company.web.exceptions"
        }
)
@PropertySource(value = "classpath:application.yml")
public class WebApplicationConfig
{

}