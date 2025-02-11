package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.FlashDrive;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlashDriveRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        FlashDrive flashDrive = applicationContext.getBean(FlashDrive.class);
//        flashDrive.setId(1411);
//        flashDrive.setBrand("Kingston");
//        flashDrive.setPrise(5011.00);
        System.out.println(flashDrive);
    }
}
