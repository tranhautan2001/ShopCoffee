package com.example.api.service.cart.impl;


import com.example.api.entity.product.Cart;
import com.example.api.repository.Cart.ICartRepository;
import com.example.api.service.cart.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CartService implements ICartService {

    @Autowired
    private ICartRepository cartRepository;


    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public void addCart(String address_customer, Integer code, String name, String name_customer, String oder_date, String phone_number_customer, Integer user_id) {
        cartRepository.addCart(address_customer, code, name, name_customer, oder_date, phone_number_customer, user_id);
    }

    @Override
    public Integer checkCode() {
        final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        final int LENGTH = 10;
        Random random = new Random();
        char[] text = new char[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            text[i] = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
        }
        return new Integer(String.valueOf(text));
    }
}
