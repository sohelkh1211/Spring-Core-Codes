package com.sohel.springcore;

import java.util.*;

public class Employee {
    private int id;
    private String name;
    private List<String> tasks;
    private Set<String> skills;
    private Map<String, Boolean> benefits;

    public Employee() {
        tasks = new ArrayList<>();
        skills = new HashSet<>();
        benefits = new HashMap<>();
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

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Map<String, Boolean> getBenefits() {
        return benefits;
    }

    public void setBenefits(Map<String, Boolean> benefits) {
        this.benefits = benefits;
    }

    public void work() {
        System.out.println("Doing Task....");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                ", skills=" + skills +
                ", benefits=" + benefits +
                '}';
    }
}
