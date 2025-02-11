package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Router {
    @Value("2011")
    private Integer id;
    @Value("TP-Link Archer")
    private String brand;
    @Value("5712.00")
    private Double prise;
}
