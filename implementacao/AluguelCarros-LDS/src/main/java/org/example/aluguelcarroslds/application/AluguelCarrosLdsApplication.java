package org.example.aluguelcarroslds.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AluguelCarrosLdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AluguelCarrosLdsApplication.class, args);
    }
}
