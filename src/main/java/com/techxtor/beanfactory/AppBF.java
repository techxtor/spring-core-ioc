package com.techxtor.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppBF
{
    public static void main( String[] args )
    {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        AlienBF alienBF = (AlienBF) factory.getBean("alienBF");
//        alienBF.code();
    }
}
