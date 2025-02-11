package com.xworkz.coreapp;

import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PowerBankRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PowerBank powerBank = applicationContext.getBean(PowerBank.class);
        powerBank.setId(101);
        powerBank.setBrand("Mi Power Bank");
        powerBank.setPrise(550.20);
        System.out.println(powerBank);
    }
}
