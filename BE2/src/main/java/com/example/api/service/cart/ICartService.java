package com.example.api.service.cart;

import com.example.api.entity.product.Cart;
import com.example.api.entity.product.CartDetail;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartService {
    List<Cart> findAll();
    void addCart(String address_customer, Integer code,  String name,String name_customer, String oder_date,  String phone_number_customer,Integer user_id);
    Integer checkCode();
}
