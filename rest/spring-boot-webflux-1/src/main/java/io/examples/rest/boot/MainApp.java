package io.examples.rest.boot;

import io.examples.store.repository.FluxProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Main Application
 *
 * @author Gary Cheng
 */
@Configuration
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Bean
    FluxProductRepository productRepository() {
        return FluxProductRepository.getInstance();
    }
}
