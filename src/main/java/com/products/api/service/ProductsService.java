package com.products.api.service;

import java.util.ArrayList;
import java.util.Optional;

import com.products.api.models.Product;
import com.products.api.repositories.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public ArrayList<Product> getProductList() {
        return (ArrayList<Product>) productsRepository.findAll();
    }

    public Product addProduct(Product product){
        return productsRepository.save(product);
    }

    public Optional<Product> getById(Integer id){
        return productsRepository.findById(id);
    }
}   
