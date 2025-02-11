package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.AirConditioner;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirConditionerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AirConditioner airConditioner = applicationContext.getBean(AirConditioner.class);
//        airConditioner.setId(10221);
//        airConditioner.setBrand(" Blue Star");
//        airConditioner.setPrise(25200.00);
        System.out.println(airConditioner);
    }
}
