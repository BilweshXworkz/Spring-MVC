package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Microphone;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MicrophoneRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Microphone microphone = applicationContext.getBean(Microphone.class);
//        microphone.setId(101);
//        microphone.setBrand("Rode NT1");
//        microphone.setPrise(7850.00);
        System.out.println(microphone);
    }
}
