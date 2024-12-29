package org.example.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //let spring to manage - create the object, assemble the object, manage
public class Alien {

    @Autowired  //now spring knows it has the responsibility to search for this laptop object inside the container
    Laptop laptop;
    public void code(){
        laptop.compile();
        System.out.println("Coding");
    }
}
