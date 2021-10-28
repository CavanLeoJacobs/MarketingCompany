package marketing.company.logic.config;


import marketing.company.translator.config.TranslatorConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(TranslatorConfig.class)
@Configuration
@ComponentScan(basePackages =
        {
        "marketing.company.logic.flow"
       })
public class LogicConfig
{
    //this is where we create,delete,view the photos
    //Logic is the place for codeing in the impl
    // and the flow is the this we get from the domain dto
}
