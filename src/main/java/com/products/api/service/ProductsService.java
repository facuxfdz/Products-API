package com.products.api.service;

import java.util.ArrayList;

import com.products.api.models.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    public ArrayList<Product> getProductList(){
        return new ArrayList<>();
    }
    
}
