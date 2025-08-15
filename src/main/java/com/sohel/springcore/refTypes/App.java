package com.sohel.springcore.refTypes;

import com.sohel.springcore.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Student: "+student);

        // Constructor Injection
        Student student1 = (Student) context.getBean("student1");
        System.out.println("Student1: "+student1);

        // Autowiring By Type - Use when you have only one object(bean) E.g: scores
        // We can still use it, if we specify one of the bean as primary.
        Student student2 = (Student) context.getBean("student2");
        System.out.println("Student2: " +student2);

        // Autowiring By Name - Use when you have multiple objects(beans) E.g: scores1, scores2
        Student student3 = (Student) context.getBean("student3", Student.class);
        System.out.println("Student3: " +student3);

    }
}
