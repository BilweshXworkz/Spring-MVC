package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Computer;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class    );
        Computer computer = applicationContext.getBean(Computer.class);
//        computer.setId(1);
//        computer.setBrand("HP");
//        computer.setPrise(75000.00);
//        computer.setRam("4GB");
        System.out.println(computer);
    }
}
