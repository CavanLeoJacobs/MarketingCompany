package marketing.company.web;


import io.swagger.models.Swagger;
import marketing.company.web.config.Sagger;
import marketing.company.web.config.WebApplicationConfig;
import org.jetbrains.annotations.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class ApplicationMain
{


    public static void main(String[] args) {

     SpringApplication.run(ApplicationMain.class, args);

        //new WebApplicationConfig();

       // SpringApplication.run(WebApplicationConfig.class, args);
       // SpringApplication.run(WebApplicationConfig.class, args);
        //SpringApplication.run(ApplicationMain.class,args);

    }



}

