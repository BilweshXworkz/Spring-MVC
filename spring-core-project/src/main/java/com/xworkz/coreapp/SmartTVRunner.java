package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.SmartTV;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartTVRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SmartTV smartTV = applicationContext.getBean(SmartTV.class);
        smartTV.setId(10141);
        smartTV.setBrand("Smart TV");
        smartTV.setPrise(25000.00);
        System.out.println(smartTV);
    }
}
