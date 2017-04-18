package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by vagrant on 4/17/17.
 */
/*A startable Springboot has three parts, @, class and run*/
@SpringBootApplication
public class HelloWorldDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloWorldDemoApplication.class);
    }
}
