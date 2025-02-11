package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Router;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RouterRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Router router = applicationContext.getBean(Router.class);
        router.setId(2011);
        router.setBrand("TP-Link Archer");
        router.setPrise(5712.00);
        System.out.println(router);
    }
}
