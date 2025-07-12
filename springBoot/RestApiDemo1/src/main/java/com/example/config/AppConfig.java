package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Car;

@Configuration
public class AppConfig {

    @Bean
    public FuelType fuelType() {
        return FuelType.ELECTRIC;
    }

    @Bean
    public Engine engine() {
        return new Engine(fuelType().name());
    }

    @Bean
    public Car car() {
        return new Car(engine());
    }
}
