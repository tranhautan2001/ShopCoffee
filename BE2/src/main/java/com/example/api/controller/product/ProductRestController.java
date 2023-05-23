package com.example.api.controller.product;

import com.example.api.entity.product.Product;
import com.example.api.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/user/product")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public ResponseEntity<?> listProducts(
            @RequestParam(name = "name", defaultValue = "") String name,
            @RequestParam(name = "product_type_id", defaultValue = "0") Integer product_type_id) {
        List<Product> products = productService.ListProduct(name, product_type_id);
        if (products.isEmpty()) {
            return new ResponseEntity<>( new ArrayList<>(), HttpStatus.OK);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
