package com.techxtor.setterinjection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSIP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AlienSIP obj1 = (AlienSIP) context.getBean("alienSIP");
        obj1.code();
        System.out.println(obj1.getAge()); // 12
    }
}
