package com.shopApp.shopApp.repository;

import com.shopApp.shopApp.models.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
