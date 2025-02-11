package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class VacuumCleaner {
    @Value("1")
    private Integer id;
    @Value("Eureka Forbes")
    private String brand;
    @Value("7502.00")
    private Double prise;
}
