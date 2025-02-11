package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class HeadPhone {
    private Integer id;
    private String brand;
    private Double prise;

    @Autowired
    public  HeadPhone(@Value("101") int id, @Value("JBL") String brand, @Value("5241.00") double prise){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
    }
}
