package com.ecommerce.styway.repository;

import com.ecommerce.styway.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
