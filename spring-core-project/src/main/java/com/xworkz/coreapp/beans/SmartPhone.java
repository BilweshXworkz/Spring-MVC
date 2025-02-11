package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class SmartPhone {
    @Value("1")
    private Integer id;
    @Value("iPhone 16")
    private String brand;
    @Value("79999.00")
    private Double prise;
}
