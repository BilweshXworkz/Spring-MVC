package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.GamingConsole;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingConsoleRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        GamingConsole gamingConsole = applicationContext.getBean(GamingConsole.class);
//        gamingConsole.setId(1221);
//        gamingConsole.setBrand("Microsoft Xbox");
//        gamingConsole.setPrise(5412.00);
        System.out.println(gamingConsole);
    }
}
