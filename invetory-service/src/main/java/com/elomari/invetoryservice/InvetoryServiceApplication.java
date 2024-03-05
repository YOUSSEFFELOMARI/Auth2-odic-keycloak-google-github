package com.elomari.invetoryservice;

import com.elomari.invetoryservice.entities.Product;
import com.elomari.invetoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InvetoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvetoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                    .quantity(12)
                    .price(4300)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Phone")
                    .quantity(11)
                    .price(12000)
                    .build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .quantity(3)
                    .price(1200)
                    .build());
        };
    }
}
