package com.products.api.service;

import java.util.ArrayList;

import com.products.api.models.Product;
import com.products.api.repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    public ArrayList<Product> getProductList() {
        return productsRepository.find();
    }

    public Product addProduct(Product product){
        return productsRepository.add(product);
    }

    public Product getById(Integer id){
        return productsRepository.findById(id);
    }
}   
