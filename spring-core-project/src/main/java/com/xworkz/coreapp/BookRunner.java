package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.Book;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Book book = applicationContext.getBean(Book.class);
        book.setId(101);
        book.setBookName("Think Like A Monk");
        book.setPrise(550.00);
        book.setRating(4.8);
        System.out.println(book);

        System.out.println(book.getId());
    }
}
