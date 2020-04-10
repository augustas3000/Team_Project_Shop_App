package com.shopApp.shopApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sneakers")
public class Sneaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column
    private String model;

    @Column
    private Double size;

    @Column(name = "image_link")
    private String imgLink;

    @Column(name = "stock_price")
    private Double stockPrice;

    @Column(name = "retail_price")
    private Double retailPrice;

    @ManyToMany
    @JoinTable(
            joinColumns= {@JoinColumn(name="sneaker_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="order_id", nullable = false, updatable = false)}
    )
    private List<Order> orders;


    public Sneaker(String brand,String model, String imgLink,Double size, Double stockPrice, Double retailPrice){
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.imgLink = imgLink;
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
        this.orders = new ArrayList<>();

    }

    public Sneaker() {
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }
}




