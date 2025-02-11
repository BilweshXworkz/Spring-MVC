package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Monitor {
    private Integer id;
    private String brand;
    private Double prise;

    @Autowired
    public  Monitor(@Value("101") int id, @Value("ASUS ROG Swift") String brand, @Value("75241.00") double prise){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
    }
}
