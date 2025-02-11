package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class KeyBoard {
    private Integer id;
    private String brand;
    private Double prise;
    private String color;
    private Boolean booking;

    @Autowired
    public  KeyBoard(@Value("101") int id, @Value("Logitech MX Keys") String brand, @Value("5241.00") double prise, @Value("Black") String color, @Value("true") boolean booking){
        this.id = id;
        this.brand = brand;
        this.prise = prise;
        this.color = color;
        this.booking = booking;
    }
}
