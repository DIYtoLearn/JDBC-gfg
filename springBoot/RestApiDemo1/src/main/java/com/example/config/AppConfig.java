package com.example.config;
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
