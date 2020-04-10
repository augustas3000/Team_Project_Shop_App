package com.shopApp.shopApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "stock_price")
    private Double stockPrice;

    @Column(name = "retail_price")
    private Double retailPrice;

    @Column(name = "image_link")
    private String imgLink;


    public Product(String name, Double stockPrice, Double retailPrice, String imgLink) {
        this.name = name;
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
        this.imgLink = imgLink;
    }

    public Product() {
    }


//    getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImgLink() {
        return imgLink;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

}

