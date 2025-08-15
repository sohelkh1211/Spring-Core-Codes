package com.sohel.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = (Employee) context.getBean("employee2");
        employee1.work();
        System.out.println("Employee: " +employee1);
        System.out.println("Employee: " +employee2);
    }
}
