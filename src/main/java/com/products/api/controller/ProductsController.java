package com.products.api.controller;

import java.util.ArrayList;

import com.products.api.models.Product;
import com.products.api.repository.ProductsRepository;
import com.products.api.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/products")
public class ProductsController {
    
    @Autowired
    ProductsService productsService;
    
    @Autowired
    ProductsRepository productsRepository;

    @GetMapping
    public ArrayList<Product> getProducts(){
        return productsRepository.find();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productsRepository.add(product);
    }

    @GetMapping(path = "/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productsRepository.findById(id);
    }
}
