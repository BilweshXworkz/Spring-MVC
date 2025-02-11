package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.WallClock;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WallClockRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        WallClock wallClock = applicationContext.getBean(WallClock.class);
//        wallClock.setId(1);
//        wallClock.setBrand("Quartz");
//        wallClock.setStock(15);
//        wallClock.setPrise(700.00);
        System.out.println(wallClock);
    }
}
