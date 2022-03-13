package com.techxtor.singletonprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AlienSP obj1 = (AlienSP) context.getBean("alienSP");
        obj1.code();
        obj1.age=15;
        System.out.println(obj1.age); // 15

        AlienSP obj2 = (AlienSP) context.getBean("alienSP");
        obj2.code();
        System.out.println(obj2.age); // 0
    }
}

/*

 */