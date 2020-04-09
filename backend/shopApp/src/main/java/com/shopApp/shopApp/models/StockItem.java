package com.shopApp.shopApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stock_items")
public class StockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image_link")
    private String imgLink;

    @Column(name = "stock_price")
    private Double stockPrice;

    @Column(name = "retail_price")
    private Double retailPrice;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;


    @OneToMany(mappedBy = "stockItem", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;



    public StockItem(String name, String imgLink, Double stockPrice, Double retailPrice, int quantityInStock) {
        this.name = name;
        this.imgLink = imgLink;
        this.stockPrice = stockPrice;
        this.retailPrice = retailPrice;
        this.orderDetails = new ArrayList<OrderDetail>();
        this.quantityInStock = quantityInStock;
    }

    public StockItem() {
    }


    public void addOrderDetails(OrderDetail orderDetail) {
        this.orderDetails.add(orderDetail);
    }

//    getters


    public int getQuantityInStock() {
        return quantityInStock;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

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

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}

