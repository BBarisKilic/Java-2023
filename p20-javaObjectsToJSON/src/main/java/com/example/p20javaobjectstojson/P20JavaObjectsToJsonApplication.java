package com.example.p20javaobjectstojson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class P20JavaObjectsToJsonApplication {

    public static void main(String[] args) {
        // Run the application
        SpringApplication.run(P20JavaObjectsToJsonApplication.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("Hello!", List.of("red", "green", "blue"), new Person("John", 20));
    }

    record Person(String name, int age) {
    }

    public record GreetResponse(String greet, List<String> favoriteColors, Person person) {
    }

}
