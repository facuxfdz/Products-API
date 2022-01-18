package com.products.api.repository;

import java.util.ArrayList;

import com.products.api.models.Product;
import com.products.api.models.Products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsRepository {
    
    private static final Logger logger = LogManager.getLogger(ProductsRepository.class);

    @Autowired
    ApplicationContext applicationContext;

    public ArrayList<Product> find(){  
        Products products = (Products) applicationContext.getBean("getProductsBean");
        return products;
    }

    public Product add(Product product){
        Products products = (Products) applicationContext.getBean("getProductsBean");
        products.add(product);
        logger.info("Product added to list in memory");
        return product;
    }
}
