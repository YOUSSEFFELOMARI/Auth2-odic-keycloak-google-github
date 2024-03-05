package com.elomari.invetoryservice.repository;

import com.elomari.invetoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,String> {
}
