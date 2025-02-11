package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Tripod;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TripodRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Tripod tripod = applicationContext.getBean(Tripod.class);
//        tripod.setId(1001);
//        tripod.setBrand(" Joby GorillaPod");
//        tripod.setPrise(2500.00);
        System.out.println(tripod);
    }
}
