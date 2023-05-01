package com.udacity.store.controller;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200")


public class ProductController {
    // TODO: Use the mapping products to add an API endpoint to fetch the products from the ProductRepository

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/{Id}")
    public Product getProduct(@PathVariable long Id) {
        return productRepository.findById(Id).get();
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
