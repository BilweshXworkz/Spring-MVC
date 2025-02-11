package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.HeadPhone;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HeadPhoneRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HeadPhone headPhone = applicationContext.getBean(HeadPhone.class);
//        headPhone.setId(1101);
//        headPhone.setBrand("JBL");
//        headPhone.setPrise(2250.00);
        System.out.println(headPhone);
    }
}
