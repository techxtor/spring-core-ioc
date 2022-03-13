package com.techxtor.setterinjection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSIR {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AlienSIR obj1 = (AlienSIR) context.getBean("alienSIR");
        obj1.code();
        System.out.println(obj1.getAge()); // 20
    }
}
