package org.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    private final HelloService helloService;

    public HelloCommandLineRunner(HelloService helloService) {
        this.helloService = helloService;
    }

    public void run(String... args) throws Exception {
        this.helloService.SayHello("World");
    }
}
