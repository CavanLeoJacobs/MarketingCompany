package marketing.company.logic.config;

import marketing.company.translator.config.TranslatorConfig;
import org.jetbrains.annotations.Contract;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TranslatorConfig.class)
@ComponentScan(basePackages =
       {
               "marketing.company.logic",
                "marketing.company.logic.flow.impl"
       })

public class LogicConfig
{
    @Contract(pure = true)
    public LogicConfig()
    {

    }




}
