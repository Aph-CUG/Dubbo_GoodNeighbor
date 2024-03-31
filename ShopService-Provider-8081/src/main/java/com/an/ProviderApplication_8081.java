package com.an;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProviderApplication_8081 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication_8081.class, args);
    }
}
