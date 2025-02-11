package com.xworkz.coreapp;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class PowerBank {
    private Integer id;
    private String brand;
    private Double prise;
}
