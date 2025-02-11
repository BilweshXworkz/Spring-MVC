package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.SmartPhone;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SmartPhone smartPhone = applicationContext.getBean(SmartPhone.class);
//        smartPhone.setId(414);
//        smartPhone.setBrand("iPhone 16");
//        smartPhone.setPrise(79999.00);
        System.out.println(smartPhone);
    }
}
