package org.example.aluguelcarroslds.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example"})
public class AluguelCarrosLdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AluguelCarrosLdsApplication.class, args);
    }

}
