package dnyanyog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dnyanyog", "dnyanyogconfig"})
public class AuthenticationMain {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationMain.class, args);
    }
}

 


