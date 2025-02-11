package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.KeyBoard;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KeyBoardRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        KeyBoard keyBoard = applicationContext.getBean(KeyBoard.class);
//        keyBoard.setId(1001);
//        keyBoard.setBrand("Logitech MX Keys");
//        keyBoard.setPrise(2500.00);
//        keyBoard.setColor("BG colors");
//        keyBoard.setBooking(true);
        System.out.println(keyBoard);
    }
}
