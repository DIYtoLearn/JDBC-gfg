package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "person_id") // Join with Person Table
public class Employee extends Person {

    private double salary;

    public Employee() {}

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // Getters and Setters
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
