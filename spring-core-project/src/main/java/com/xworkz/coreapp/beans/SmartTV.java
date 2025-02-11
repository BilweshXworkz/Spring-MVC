package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class SmartTV {
    @Value("1")
    private Integer id;
    @Value("Smart TV")
    private String brand;
    @Value("75000.00")
    private Double prise;
}
