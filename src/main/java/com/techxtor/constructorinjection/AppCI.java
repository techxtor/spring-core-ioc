package com.techxtor.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AlienCI obj1 = (AlienCI) context.getBean("alienCI");
        obj1.code();
        System.out.println(obj1.getAge()); // 32
        // 0 -> if <property name="age" value="20"></property> not provided in spring.xml
    }
}
