package org.example.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    // comment out this bean to see the auto configuration kicks in
    @Bean
    public HelloService helloService() {
        return new ConsoleHelloService("Howdy", " :-)");
    }
}
