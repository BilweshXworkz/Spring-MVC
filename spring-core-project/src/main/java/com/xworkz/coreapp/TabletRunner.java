package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Tablet;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TabletRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Tablet tablet = applicationContext.getBean(Tablet.class);
//        tablet.setId(10021);
//        tablet.setName("Samsung Galaxy Tab");
//        tablet.setStorage("250GB");
//        tablet.setPrise(15000.00);
        System.out.println(tablet);
    }
}
