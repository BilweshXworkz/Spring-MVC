package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component

public class Stand {
    private Integer id;
    private String brand;
    private double prise;

    @Autowired
    public Stand(@Value("3") int id, @Value("Studio") String brand, @Value("505.00") double prise){
        System.out.println("The Const is called");
        this.id = id;
        this.brand = brand;
        this.prise = prise;
    }
}
