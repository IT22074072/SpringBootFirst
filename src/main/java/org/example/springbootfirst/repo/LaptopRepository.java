package org.example.springbootfirst.repo;

import org.example.springbootfirst.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){

        System.out.println("Saved in database");
    }
}
