package com.example.api.controller.product;

import com.example.api.entity.product.ProductType;
import com.example.api.service.product.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/user/product-type")
public class ProductTypeRestController {
    @Autowired
    IProductTypeService productTypeService;

    @GetMapping("")
    public ResponseEntity<List<ProductType>> List(){
        List<ProductType> typeList = productTypeService.ListProductType();
        if (typeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(typeList, HttpStatus.OK);
    }
}
