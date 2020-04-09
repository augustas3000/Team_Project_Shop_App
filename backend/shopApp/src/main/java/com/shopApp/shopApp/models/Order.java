package com.shopApp.shopApp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy= "order", fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;

    @Column(name = "is_completed")
    private Boolean isCompleted;



    public Order(String date, Customer customer) {
        this.date = date;
        this.customer = customer;
        this.orderDetails = new ArrayList<OrderDetail>();
        this.isCompleted = false;
    }

    public Order() {
    }


    public void addOrderDetails(OrderDetail orderDetail) {
        this.orderDetails.add(orderDetail);
    }

//    getters


    public Boolean getCompleted() {
        return isCompleted;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

//    setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
