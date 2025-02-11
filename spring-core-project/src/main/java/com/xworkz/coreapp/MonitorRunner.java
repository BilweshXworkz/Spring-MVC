package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Monitor;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MonitorRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Monitor monitor = applicationContext.getBean(Monitor.class);
//        monitor.setId(1411);
//        monitor.setBrand("ASUS ROG Swift");
//        monitor.setPrise(60414.00);
        System.out.println(monitor);
    }
}
