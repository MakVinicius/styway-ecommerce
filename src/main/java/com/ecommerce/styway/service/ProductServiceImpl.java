package com.ecommerce.styway.service;

import com.ecommerce.styway.entity.Product;
import com.ecommerce.styway.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {

        Optional<Product> existingProduct = productRepository.findById(product.getId());

        if (existingProduct.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        
        return productRepository.save(product);
    }
}
