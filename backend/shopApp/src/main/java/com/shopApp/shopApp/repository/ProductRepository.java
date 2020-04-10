package com.shopApp.shopApp.repository;

import com.shopApp.shopApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
