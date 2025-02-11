package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Speaker {
    @Value("10120")
    private Integer id;
    @Value("Sony SRS-XB")
    private String brand;
    @Value("5780.00")
    private Double prise;
}
