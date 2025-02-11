package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Tablet {
    @Value("10021")
    private Integer id;
    @Value("Samsung Galaxy Tab")
    private String name;
    @Value("15000.00")
    private Double prise;
    @Value("250GB")
    private String storage;
}
