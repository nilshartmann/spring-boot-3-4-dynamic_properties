package com.example.demo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class DemoTestConfig {
    @Bean
    DummyService dummyService(DynamicPropertyRegistry registry) {
        registry.add("demo.test.prop", () -> "Hello World");

        return new DummyService();
    }
}
