package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class HardDrive {
    private Integer id;
    private String brand;
    private String storage;
    private Double prise;

    @Autowired
    public  HardDrive(@Value("101") int id, @Value("Toshiba") String brand, @Value("500 GB") String storage,@Value("5241.00") double prise){
        this.id = id;
        this.brand = brand;
        this.storage = storage;
        this.prise = prise;
    }
}
