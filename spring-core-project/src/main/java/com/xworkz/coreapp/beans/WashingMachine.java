package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class WashingMachine {
    @Value("1")
    private Integer id;
    @Value("LG")
    private String brand;
    @Value("15000.00")
    private Double prise;
}
