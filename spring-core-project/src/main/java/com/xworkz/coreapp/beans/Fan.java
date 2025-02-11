package com.xworkz.coreapp.beans;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Fan {
    private Integer id;
    private String brand;
    private double prise;
    private double rating;

    public Fan(@Value("1") int id, @Value("USHA") String brand, @Value("5547.00") double prise, @Value("5.5") double rating){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
        this.rating = rating;
    }
}
