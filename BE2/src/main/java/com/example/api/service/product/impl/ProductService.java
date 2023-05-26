package com.example.api.service.product.impl;

import com.example.api.entity.product.Product;
import com.example.api.repository.product.IProductRepository;
import com.example.api.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> ListProduct(String name, Integer product_type_id) {
        return productRepository.ListProduct(name,product_type_id);
    }

    @Override
    public Product Detail(Integer id) {
        return productRepository.Detail(id);
    }
}
