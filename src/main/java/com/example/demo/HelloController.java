package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int counter = 0;

    @GetMapping("/")
    public String home() {
        return "Welcome! Try /hello to see the counter.";
    }

    @GetMapping("/hello")
    public String hello() {
        counter++;
        String message = "Hello from Spring Boot in Codespaces! This endpoint has been called " + counter + " times.";

        if (counter > 5) {
            message += " 🤪 Okay, now you're just showing off!";
        }

        return message;
    }
}
