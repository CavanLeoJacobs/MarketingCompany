package marketing.company.logic.config;


import marketing.company.translator.config.TranslatorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.springframework.boot.SpringApplication.run;

@Import(TranslatorConfig.class)
@Configuration
@ComponentScan(basePackages =
        {
        "marketing.company.logic.flow"
       })
@SpringBootApplication
public class LogicConfig
{
       public LogicConfig()
       {

              SpringApplication.run(TranslatorConfig.class);
       }




}
