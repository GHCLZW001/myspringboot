package com.example.myspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("classpath:application.yml")


public class MyspringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }
}
