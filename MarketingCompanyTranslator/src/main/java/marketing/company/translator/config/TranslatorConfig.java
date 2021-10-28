package marketing.company.translator.config;


import marketing.company.repo.config.RepositoryConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(RepositoryConfig.class)
@Configuration
@ComponentScan(basePackages = {
        "marketing.company.translator.Impl" })
public class TranslatorConfig
{

}
