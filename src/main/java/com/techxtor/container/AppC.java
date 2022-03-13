package com.techxtor.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AlienC obj1 = (AlienC) context.getBean("alienC");
        obj1.code();
        obj1.age=15;
        System.out.println(obj1.age); // 15

        AlienC obj2 = (AlienC) context.getBean("alienC");
        obj2.code();
        System.out.println(obj2.age); // 15
    }
}

/*

 */