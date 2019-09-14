package com.playtika.javaacademy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooContext {

    @Value("${service.zoo.name}")
    private String name;

    @Bean
    public Dog dog() {
        return new Dog(name);
    }

}
