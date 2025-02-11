package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Bag;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Bag bag = applicationContext.getBean(Bag.class);
//        bag.setId(101);
//        bag.setName("WildCraft");
//        bag.setPrise(5250.00);
        System.out.println(bag);
    }
}
