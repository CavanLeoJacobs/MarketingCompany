package marketing.company.translator.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "marketing.company.translator.Impl" })
public class TranslatorConfig
{

}
