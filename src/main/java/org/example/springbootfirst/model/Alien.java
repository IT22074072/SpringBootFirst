package org.example.springbootfirst.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //let spring to manage - create the object, assemble the object, manage
public class Alien {
    @Value("1")
    private int age;
    private Computer com;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired  //now spring knows it has the responsibility to search for this laptop object inside the container
    @Qualifier("laptop") //even though primary is set to desktop, Qualifier gets ahead
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("Coding");
    }
}
