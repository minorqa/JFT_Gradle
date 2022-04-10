package com.example.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandboxApplication.class, args);
        String message = setMessage();
        displayReallyImportantMessage(message);
    }

    public static String setMessage() {
        String message = "I WANT PIZZA";
        return message;
    }

    private static void displayReallyImportantMessage(String message) {
        System.out.println(message);
    }
}
