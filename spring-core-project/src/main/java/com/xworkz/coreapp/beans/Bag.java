package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Bag {
    @Value("451")
    private Integer id;
    @Value("HP bag")
    private String name;
    @Value("523.00")
    private double prise;
}
