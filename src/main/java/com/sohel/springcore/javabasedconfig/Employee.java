package com.sohel.springcore.javabasedconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private String name;
    @Autowired
    private Dependent dependent;

    public Employee() {
        System.out.println("Employee Object created.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dependent getDepenedent() {
        return dependent;
    }

    public void setDependent(Dependent depenedent) {
        this.dependent = depenedent;
    }

    public Employee(Dependent dependent) {
        this.dependent = dependent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depenedent=" + dependent +
                '}';
    }
}