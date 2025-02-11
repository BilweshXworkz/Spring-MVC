package com.xworkz.coreapp.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Computer {
    private Integer id;
    private String brand;
    private double prise;
    private String ram;

    @Autowired
    public Computer(@Value("1") int id, @Value("HP") String brand, @Value("1650") double prise, @Value("4GB") String ram){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
        this.ram = ram;
    }
}
