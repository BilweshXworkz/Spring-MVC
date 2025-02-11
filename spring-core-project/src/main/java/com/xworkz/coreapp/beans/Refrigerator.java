package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Refrigerator {
    @Value("1")
    private Integer id;
    @Value("Whirlpool")
    private String brand;
    @Value("75000.00")
    private Double prise;
}
