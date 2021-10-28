package marketing.company.web.config;



import marketing.company.logic.config.LogicConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Import(LogicConfig.class)
//@SpringBootApplication
@Configuration
@ComponentScan(basePackages =
        {
                "marketing.company.web.controller",
                "marketing.company.web.exceptions",

        }
)
//@PropertySource(value = "")
public class WebApplicationConfig
{

}