package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Camera {
    private Integer id;
    private String brand;
    private String focus;
    private Double prise;

    @Autowired
    public Camera(@Value("1") int id, @Value("Sony E") String brand, @Value("1650") String  focus, @Value("61490.00") double prise ){
        this.id = id;
        this.brand = brand;
        this.focus = focus;
        this.prise = prise;
    }
}
