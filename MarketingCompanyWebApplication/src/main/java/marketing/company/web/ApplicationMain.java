package marketing.company.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApplicationMain
{

    public static void main(String[] args) {


        try
        {
            SpringApplication.run(ApplicationMain.class, args);
        }
        catch (Exception error)
        {
         //   System.out.println(error.getClass());
          //  System.out.println(error.getLocalizedMessage());
          //  System.out.println(error.getMessage());
        }



    }



}

