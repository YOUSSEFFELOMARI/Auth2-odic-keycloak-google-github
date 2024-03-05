package com.elomari.invetoryservice.web;


import com.elomari.invetoryservice.entities.Product;
import com.elomari.invetoryservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private final ProductRepository productRepository;

    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> products(){
        return productRepository.findAll();
    }
}
