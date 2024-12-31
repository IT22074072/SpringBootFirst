package org.example.springbootfirst.service;

import org.example.springbootfirst.repo.LaptopRepository;
import org.example.springbootfirst.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap){
        return  true;
    }
}
