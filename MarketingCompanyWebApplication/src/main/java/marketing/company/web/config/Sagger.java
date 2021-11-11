package marketing.company.web.config;

//@Configuration
//@EnableSwagger2
//@Import(springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class)

import org.jetbrains.annotations.Contract;

public class Sagger
{
    @Contract
   public Sagger()
    {

    }


/*
    @Value("${swagger.application.version}")
    private String applicationVersion;
    @Value("${swagger.application.name}")
    private String applicationName;
    @Value("${swagger.application.description}")
    private String applicationDescription;

    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(apiInfo());
    }
   // @org.jetbrains.annotations.NotNull
    //@org.jetbrains.annotations.Contract(" -> new")
    private ApiInfo apiInfo()
    {
        return new ApiInfo (
                applicationName ,
                applicationDescription,
                applicationVersion,
                "",
                new Contact("YOUR NAME or TEAM NAME","","email address"),
                "",
                "",
                Collections.emptyList());

    }


 */
}
