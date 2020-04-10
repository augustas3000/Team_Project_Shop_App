package com.shopApp.shopApp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;


@Entity
public class OrderProduct {

//A composite primary key – also called a composite key – is a combination of two or more columns to form a primary key for a table.
//In JPA, we have two options to define the composite keys: The @IdClass and @EmbeddedId annotations.
//In order to define the composite primary keys, we should follow some rules:
//
//The composite primary key class must be public
//It must have a no-arg constructor
//It must define equals() and hashCode() methods - hence the method below.
//It must be Serializable

    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;

    @Column(nullable = false) private Integer quantity;

    public OrderProduct() {
        super();
    }

    public OrderProduct(Order order, Product product, Integer quantity) {
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setProduct(product);
        this.quantity = quantity;
    }

    @Transient
    public Product getProduct() {
        return this.pk.getProduct();
    }

    @Transient
    public Double getTotalPrice() {
        return getProduct().getStockPrice() * getQuantity();
    }

    public OrderProductPK getPk() {
        return pk;
    }

    public void setPk(OrderProductPK pk) {
        this.pk = pk;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        com.shopApp.shopApp.models.OrderProduct other = (com.shopApp.shopApp.models.OrderProduct) obj;
        if (pk == null) {
            if (other.pk != null) {
                return false;
            }
        } else if (!pk.equals(other.pk)) {
            return false;
        }

        return true;
    }
}
