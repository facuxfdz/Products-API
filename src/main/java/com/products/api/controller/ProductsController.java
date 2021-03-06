package com.products.api.controller;

import java.util.ArrayList;

import com.products.api.models.Product;
import com.products.api.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/products")
public class ProductsController {
    
    @Autowired
    ProductsService productsService;
    

    @GetMapping
    public ArrayList<Product> getProducts(){
        return productsService.getProductList();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productsService.addProduct(product);
    }

    @GetMapping(path = "/{id}")
    public Product getProductById(@PathVariable String id){
        return productsService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public Product deleteProduct(@PathVariable String id){
        return productsService.deleteProductById(id);
    }

    @PutMapping(path = "/title/{id}")
    public String updateProductTitle(@PathVariable String id, @RequestParam String title){
        return productsService.updateProductTitle(id,title);
    }

    @PutMapping(path = "/price/{id}")
    public String updateProductPrice(@PathVariable String id, @RequestParam Double price){
        return productsService.updateProductPrice(id,price);
    }

    @PutMapping(path = "/thumbnail/{id}")
    public String updateProductThumbnail(@PathVariable String id, @RequestParam String thumbnail){
        return productsService.updateProductThumbnail(id,thumbnail);
    }
}
