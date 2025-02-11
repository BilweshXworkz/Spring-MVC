package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Tripod {
    @Value("1")
    private Integer id;
    @Value("Joby GorillaPod")
    private String brand;
    @Value("2500.00")
    private Double prise;
}
