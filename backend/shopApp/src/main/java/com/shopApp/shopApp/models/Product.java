package com.shopApp.shopApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "size")
    private Double size;



    @Column(name = "stock_price")
    private Double stockPrice;

    @Column(name = "retail_price")
    private Double retailPrice;

    @Column(name = "image_link")
    private String imgLink;


    public Product(String brand, String model, Double size, Double stockPrice, Double retailPrice, String imgLink) {
        this.brand = brand;
        this.model = model;
        this.size = size;
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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getSize() {
        return size;
    }


    public Double getStockPrice() {
        return stockPrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public String getImgLink() {
        return imgLink;
    }


//    setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(Double size) {
        this.size = size;
    }


    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}

