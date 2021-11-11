package marketing.company.web;

import org.jetbrains.annotations.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

class Main
{
    @Contract(pure = true)
    public static void main(String[] args)
    {
        SpringApplication.run(Main.class,args);

    }

}
