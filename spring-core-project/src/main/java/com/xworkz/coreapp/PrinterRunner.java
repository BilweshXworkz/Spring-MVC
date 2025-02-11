package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Printer;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrinterRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Printer printer = applicationContext.getBean(Printer.class);
//        printer.setId(1111);
//        printer.setBrand("Canon Pixma");
//        printer.setPrise(8571.00);
        System.out.println(printer);
    }
}
