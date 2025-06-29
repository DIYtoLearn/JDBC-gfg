package com.example.model;
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println(engine.start());
        System.out.println("Car is driving...");
    }
}
