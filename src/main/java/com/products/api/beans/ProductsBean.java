package com.products.api.beans;

import com.products.api.models.Products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductsBean {
    @Bean
    public Products getProductsBean(){
        return new Products();
    }
}
