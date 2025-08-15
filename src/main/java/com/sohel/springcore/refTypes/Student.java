package com.sohel.springcore.refTypes;

public class Student {
    private int id;
    private String name;
    private Scores scores;

    public Student() {
    }

    public Student(int id, String name, Scores scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
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

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }
}
