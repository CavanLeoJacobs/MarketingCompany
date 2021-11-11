package marketing.company.web.config;


import marketing.company.logic.config.LogicConfig;
import org.jetbrains.annotations.Contract;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LogicConfig.class)

@ComponentScan(basePackages =
        {
                "marketing.company.web",
                "marketing.company.web.controller",
                "marketing.company.web.exceptions"

        }
)

//@PropertySource(value = "index.html")
//@PropertySource(value = "logback.xml")
//@PropertySource(value = "webapp.WEB-INF.web.xml");

public class WebApplicationConfig
{
    @Contract
    public WebApplicationConfig()
    {
      //  new LogicConfig();
        //SpringApplication.run(WebApplicationConfig.class);
    }


}
/*
        public  WebApplicationConfig()
        {

              SpringApplication.run(LogicConfig.class);

        }


 */

