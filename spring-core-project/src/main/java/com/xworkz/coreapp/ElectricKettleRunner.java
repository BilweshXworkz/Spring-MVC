package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.ElectricKettle;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ElectricKettleRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ElectricKettle electricKettle = applicationContext.getBean(ElectricKettle.class);
//        electricKettle.setId(10011);
//        electricKettle.setBrand("Philips");
//        electricKettle.setPrise(2841.00);
        System.out.println(electricKettle);
    }
}
