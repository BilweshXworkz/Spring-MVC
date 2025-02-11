package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class ElectricKettle {
    private Integer id;
    private String brand;
    private Double prise;

    @Autowired
    public ElectricKettle(@Value("1") int id, @Value("Philips") String brand, @Value("550.00") double prise){
        this.id=id;
        this.brand = brand;
        this.prise = prise;
    }
}
