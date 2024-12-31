package org.example.springbootfirst.service;

import org.example.springbootfirst.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Method called");
    }

    public boolean isGoodForProg(Laptop lap){
        return  true;
    }
}
