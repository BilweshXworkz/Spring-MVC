package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Stand;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunner {
    public static void main(String[] args) {
        System.out.println("The main started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Stand stand = applicationContext.getBean(Stand.class);
        System.out.println("getBean Started");
//        stand.setId(1);
//        stand.setBrand("Majama");
//        stand.setPrise(254.00);
        System.out.println(stand);
        System.out.println("getBean Ended");
        System.out.println("The main Ended");
    }
}
