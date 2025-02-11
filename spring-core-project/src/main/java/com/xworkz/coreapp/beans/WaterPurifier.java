package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class WaterPurifier {
    @Value("1")
    private Integer id;
    @Value("Aquaguard")
    private String brand;
    @Value("5550.00")
    private Double prise;
}
