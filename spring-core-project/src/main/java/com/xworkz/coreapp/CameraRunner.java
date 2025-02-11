package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Camera;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CameraRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Camera camera = applicationContext.getBean(Camera.class);
//        camera.setId(10101);
//        camera.setBrand("Sony E");
//        camera.setFocus("1650");
//        camera.setPrise(61490.00);
        System.out.println(camera);
    }
}
