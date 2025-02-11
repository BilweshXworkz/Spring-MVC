package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.HardDrive;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HardDriveRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HardDrive hardDrive = applicationContext.getBean(HardDrive.class);
//        hardDrive.setId(1231);
//        hardDrive.setBrand("Toshiba");
//        hardDrive.setStorage("500 GB");
//        hardDrive.setPrise(4540.00);
        System.out.println(hardDrive);
    }
}
