package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Wallet {
    @Value("101")
    private Integer id;
    @Value("WoodLand")
    private String brand;
    @Value("25")
    private Integer stock;
    @Value("150.00")
    private double prise;
}
