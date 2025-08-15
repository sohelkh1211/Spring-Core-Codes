package com.sohel.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Instructor instructor = (Instructor) context.getBean("instructor");
        System.out.println("Instructor: " +instructor);
    }
}
