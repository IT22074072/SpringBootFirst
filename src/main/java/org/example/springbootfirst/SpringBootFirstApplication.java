package org.example.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

        Alien obj = context.getBean(Alien.class);
        obj.code();
    }

}

//main is depending on the alien object, alien id depending on the laptop object