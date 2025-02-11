package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Fan;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FanRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Fan fan = applicationContext.getBean(Fan.class);
//        fan.setId(1001);
//        fan.setBrand("USHA");
//        fan.setPrise(6000.00);
//        fan.setRating(4.5);
        System.out.println(fan);
    }
}
