package com.products.api.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("products")
public class Product {

    @Id
    private String id;
    private String title;
    private Double price;
    private String thumbnail;
}
