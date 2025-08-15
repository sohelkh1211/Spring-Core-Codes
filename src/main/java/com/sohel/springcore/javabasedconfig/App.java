package com.sohel.springcore.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee)context.getBean("employee");
        System.out.println("Employee: " +employee);

        Employee employee1 = (Employee)context.getBean("employee");
        System.out.println("Employee: " +employee1);
    }
}
