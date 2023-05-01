package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.nio.file.Files;


@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO: Populate the database with products
        productRepository.save(new Product("shoes", "Hawkwell Men's Fashion Sneakers Uniform Nurse Shoes", 127, "https://m.media-amazon.com/images/I/81JCWCKUCYL._AC_SY625_.jpg"));
        productRepository.save(new Product("hoodie", "American Eagle Men Super Soft Icon Graphic Hoodie", 319, "https://m.media-amazon.com/images/I/61rsdne3vuL._AC_SX466_.jpg"));
        productRepository.save(new Product("socks", "Jack & Jones Men's (Pack Of 10) Socks\n", 83, "https://m.media-amazon.com/images/I/41BxEBnmZ9L._AC_SY606_.jpg"));
        System.out.println("products saved successfully");
    }
}
