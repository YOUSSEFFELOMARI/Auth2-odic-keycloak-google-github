package com.elomari.customerfrontthymleaf;

import com.elomari.customerfrontthymleaf.entities.Customer;
import com.elomari.customerfrontthymleaf.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Mohamed").email("med@gmail.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Asmaa").email("asmaa@gmail.com").build());
        };
    }
}
