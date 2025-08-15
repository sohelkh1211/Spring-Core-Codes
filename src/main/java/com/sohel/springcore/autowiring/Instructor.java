package com.sohel.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {
    @Value("10")
    private int id;

    @Value("John leo")
    private String name;

    @Autowired
    private Profile profile;

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

    public Instructor(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Instructor() {
        super();
    }

    @Override
    public String toString() {
        return "Instructor [id=" + id + ", name=" + name + ", profile=" + profile + "]";
    }

}
