package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.WashingMachine;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WashingMachineRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        WashingMachine washingMachine = applicationContext.getBean(WashingMachine.class);
//        washingMachine.setId(1);
//        washingMachine.setBrand("LG");
//        washingMachine.setPrise(15000.00);
        System.out.println(washingMachine);
    }
}
