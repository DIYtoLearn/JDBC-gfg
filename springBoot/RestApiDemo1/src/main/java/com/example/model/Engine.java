package com.example.model;
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String start() {
        return "Engine started: " + type;
    }
}
