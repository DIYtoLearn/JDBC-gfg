package com.example.config;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.models.Car;
import com.example.models.Engine;
import com.example.models.FuelType;

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

    @Bean("car")
    public Car car() {
        return new Car(engine());
    }
}
