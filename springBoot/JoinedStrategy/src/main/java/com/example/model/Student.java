package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "person_id") // Join with Person Table
public class Student extends Person {

    private String course;

    public Student() {}

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    // Getters and Setters
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
}
