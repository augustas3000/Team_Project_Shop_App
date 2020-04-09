package com.shopApp.shopApp.models;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stock_item_id", nullable = false)
    private StockItem stockItem;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public OrderDetail(StockItem stockItem, int quantity, Order order) {
        this.stockItem = stockItem;
        this.quantity = quantity;
        this.order = order;
    }

    public OrderDetail() {
    }


//    getetrs

    public Long getId() {
        return id;
    }

    public StockItem getStockItem() {
        return stockItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }


//    setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setStockItem(StockItem stockItem) {
        this.stockItem = stockItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
