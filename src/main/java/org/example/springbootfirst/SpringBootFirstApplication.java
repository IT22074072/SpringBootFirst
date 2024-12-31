package org.example.springbootfirst;

import org.example.springbootfirst.model.Laptop;
import org.example.springbootfirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

        Laptop lap = context.getBean(Laptop.class);

        LaptopService service  = context.getBean(LaptopService.class);
        service.addLaptop(lap);


//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();
    }

}

//main is depending on the alien object, alien id depending on the laptop object