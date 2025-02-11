package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.WaterPurifier;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WaterPurifierRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        WaterPurifier waterPurifier = applicationContext.getBean(WaterPurifier.class);
//        waterPurifier.setId(1401);
//        waterPurifier.setBrand("Aquaguard");
//        waterPurifier.setPrise(2501.00);
        System.out.println(waterPurifier);
    }
}
