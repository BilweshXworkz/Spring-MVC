package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.SmartWatch;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartWatchRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SmartWatch smartWatch = applicationContext.getBean(SmartWatch.class);
//        smartWatch.setId(4140);
//        smartWatch.setBrand("Apple Watch");
//        smartWatch.setPrise(5641.00);
        System.out.println(smartWatch);
    }
}
