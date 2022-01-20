package com.products.api.repositories;

import java.util.Optional;

import com.products.api.models.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product,Integer> {
    
    public abstract Optional<Product> findById(Integer id);

}
