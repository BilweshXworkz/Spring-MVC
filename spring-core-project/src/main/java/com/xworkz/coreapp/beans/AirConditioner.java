package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class AirConditioner {
    private Integer id;
    private String brand;
    private Double prise;

    @Autowired
    public AirConditioner(@Value("101") int id, @Value("USHA") String brand,@Value("4452.00") Double prise){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
    }
}
