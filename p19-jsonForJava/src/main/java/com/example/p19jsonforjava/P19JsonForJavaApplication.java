package com.example.p19jsonforjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class P19JsonForJavaApplication {

    public static void main(String[] args) {
        // Run the application
        SpringApplication.run(P19JsonForJavaApplication.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("Hello, World!");
    }

    public record GreetResponse(String greet) {}
}