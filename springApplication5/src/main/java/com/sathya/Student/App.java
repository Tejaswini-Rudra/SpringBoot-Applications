package com.sathya.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
        ProductBean p1 = (ProductBean) ctx.getBean("id3");
       p1. printProduct();
    }
}