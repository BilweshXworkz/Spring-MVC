package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class WallClock {
    @Value("1")
    private Integer id;
    @Value("Quartz")
    private String brand;
    @Value("15")
    private Integer Stock;
    @Value("700.00")
    private double prise;
}
