package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Wallet;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WalletRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Wallet wallet = applicationContext.getBean(Wallet.class);
//        wallet.setId(101);
//        wallet.setBrand("WoodLand");
//        wallet.setPrise(150.00);
//        wallet.setStock(25);
        System.out.println(wallet);
    }
}
