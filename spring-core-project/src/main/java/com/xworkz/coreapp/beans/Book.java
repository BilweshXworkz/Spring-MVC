package com.xworkz.coreapp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class Book {
    private Integer id;
    private String bookName;
    private double prise;
    private double rating;

//    @Autowired
//    public Book(@Value("1") int id, @Value("Think Like A Monk") String bookName, @Value("520.00") double prise, @Value("4.4") double rating ){
//        this.id = id;
//        this.bookName = bookName;
//        this.prise = prise;
//        this.rating = rating;
//    }
}
