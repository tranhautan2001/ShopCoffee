package com.example.api.repository.product;

import com.example.api.entity.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product join product_type pt on product.product_type_id = pt.id join suppliers s on s.id = product.suppliers_id\n" +
            "where pt.id = coalesce(nullif(:id,0), pt.id) and product.name like CONCAT('%' :name '%') ORDER BY product.id DESC", nativeQuery = true)
    List<Product> ListProduct(@Param("name") String name, @Param("id") Integer product_type_id);
}
