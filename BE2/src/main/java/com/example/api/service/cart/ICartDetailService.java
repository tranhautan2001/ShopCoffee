package com.example.api.service.cart;

import com.example.api.entity.product.CartDetail;

import java.util.List;

public interface ICartDetailService {
    void addCartDetail(Integer quantity, Integer productId, Integer cartId);
    List<CartDetail> getCart(Integer id);
    CartDetail check(Integer userId,Integer productId);
    Integer checkCart(Integer id);

}
