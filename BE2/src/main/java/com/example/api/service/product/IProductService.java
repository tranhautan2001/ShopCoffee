package com.example.api.service.product;

import com.example.api.entity.product.Product;

import java.util.List;

public interface IProductService {
    List<Product> ListProduct( String name, Integer product_type_id);
}
