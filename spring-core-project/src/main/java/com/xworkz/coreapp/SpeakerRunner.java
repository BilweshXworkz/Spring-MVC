package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Speaker;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpeakerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Speaker speaker = applicationContext.getBean(Speaker.class);
//        speaker.setId(1421);
//        speaker.setBrand("Sony SRS-XB");
//        speaker.setPrise(5871.00);
        System.out.println(speaker);
    }
}
