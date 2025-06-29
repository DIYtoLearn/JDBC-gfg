package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.controller.DemoController;
import com.example.models.Car;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

	@Autowired
	 DemoController controller;
	
	public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(DiApplication.class, args);
		
        Car c=context.getBean(Car.class);
        System.out.println(c);

        c.drive();
      
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(controller.getData());
		
	}

}
