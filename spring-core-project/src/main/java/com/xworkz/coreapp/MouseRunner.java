package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Mouse;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MouseRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Mouse mouse = applicationContext.getBean(Mouse.class);
//        mouse.setId(741);
//        mouse.setBrand("SteelSeries Rival");
//        mouse.setPrise(6442.00);
        System.out.println(mouse);
    }
}
