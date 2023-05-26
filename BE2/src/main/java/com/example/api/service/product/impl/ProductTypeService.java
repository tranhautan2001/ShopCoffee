package com.example.api.service.product.impl;

import com.example.api.entity.product.ProductType;
import com.example.api.repository.product.IProductTypeRepository;
import com.example.api.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
@Autowired
private IProductTypeRepository productTypeRepository;
    @Override
    public List<ProductType> ListProductType() {
        return productTypeRepository.ListProductType();
    }
}
