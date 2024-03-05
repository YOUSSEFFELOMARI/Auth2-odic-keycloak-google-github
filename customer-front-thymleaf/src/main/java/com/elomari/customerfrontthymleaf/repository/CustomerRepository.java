package com.elomari.customerfrontthymleaf.repository;


import com.elomari.customerfrontthymleaf.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
