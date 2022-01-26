package com.products.api.service;

import java.util.ArrayList;

import com.mongodb.client.result.UpdateResult;
import com.products.api.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductsService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public ArrayList<Product> getProductList() {
        log.info("All products from 'products' collection were requested!");
        return (ArrayList<Product>) mongoTemplate.findAll(Product.class);
    }

    public Product addProduct(Product product){
        log.info("New product added to 'products' collection!");
        return mongoTemplate.save(product);
    }

    public Product getById(String id){
        log.info(String.format("Product with id '%s' was requested!", id));
        return  mongoTemplate.findById(id, Product.class);
    }

    public Product deleteProductById(String id){
        Query removeQuery = new Query().addCriteria(Criteria.where("id").is(id));
        log.info(String.format("Product with id '%s' deleted!",id));
        return mongoTemplate.findAndRemove(removeQuery, Product.class);
    }

    public String updateProductTitle(String id, String title){
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("title", title);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Product.class);

        if(result == null || result.getModifiedCount() == 0){
            String warnMsg = "No products were updated! :o";
            log.warn(warnMsg);
            return warnMsg;
        }
        String msg = result.getModifiedCount() + " product(s) updated!";
        log.info(msg);
        return msg;
    }

    public String updateProductPrice(String id, Double price){
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("price", price);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Product.class);

        if(result == null || result.getModifiedCount() == 0){
            String warnMsg = "No products were updated! :o";
            log.warn(warnMsg);
            return warnMsg;
        }
        String msg = result.getModifiedCount() + " product(s) updated!";
        log.info(msg);
        return msg;
    }

    public String updateProductThumbnail(String id, String thumbnail){
        Query query = new Query(Criteria.where("id").is(id));
        Update update = new Update();
        update.set("thumbnail", thumbnail);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Product.class);

        if(result == null || result.getModifiedCount() == 0){
            String warnMsg = "No products were updated! :o";
            log.warn(warnMsg);
            return warnMsg;
        }
        String msg = result.getModifiedCount() + " product(s) updated!";
        log.info(msg);
        return msg;
    }
}   

