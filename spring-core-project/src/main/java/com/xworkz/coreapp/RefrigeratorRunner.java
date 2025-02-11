package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Refrigerator;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Refrigerator refrigerator = applicationContext.getBean(Refrigerator.class);
//        refrigerator.setId(10001241);
//        refrigerator.setBrand("Whirlpool");
//        refrigerator.setPrise(75000.00);
        System.out.println(refrigerator);
    }
}
