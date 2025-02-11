package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.VacuumCleaner;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VacuumCleanerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        VacuumCleaner vacuumCleaner = applicationContext.getBean(VacuumCleaner.class);
//        vacuumCleaner.setId(102411);
//        vacuumCleaner.setBrand("Eureka Forbes");
//        vacuumCleaner.setPrise(7502.00);
        System.out.println(vacuumCleaner);
    }
}
