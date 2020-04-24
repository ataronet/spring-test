package org.example;

import org.example.hello.ConsoleHelloService;
import org.example.hello.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }
    @Bean
    public HelloService helloService() {
        return new ConsoleHelloService("Howdy", "!");
    }
}


