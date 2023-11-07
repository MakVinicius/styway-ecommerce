package com.ecommerce.styway.service;

import com.ecommerce.styway.entity.Product;
import com.ecommerce.styway.repository.ProductRepository;

public interface ProductService {


    Product createProduct(Product product);
}
