package org.example.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    Cpu cpu;
    public void compile(){
        cpu.works();
        System.out.println("Compile Laptop");
    }
}
