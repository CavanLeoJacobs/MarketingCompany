package marketing.company.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
                "marketing.company.web.controller",
                "marketing.company.web.exceptions" })
public class WebApplicationConfig {

}
