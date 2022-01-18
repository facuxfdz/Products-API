package com.products.api.models;

public class Product {

    private static Integer baseId = 0;
    private Integer id;
    private String title;
    private Double price;
    private String thumbnail;

    
    public String getTitle() {
        return title;
    }

    public static Integer getBaseId() {
        return baseId;
    }

    public static void setBaseId(Integer baseId) {
        Product.baseId = baseId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
