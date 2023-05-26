package com.example.api.service.cart.impl;

import com.example.api.entity.product.Cart;
import com.example.api.entity.product.CartDetail;
import com.example.api.repository.Cart.ICartDetailRepository;
import com.example.api.service.cart.ICartDetailService;
import com.example.api.service.cart.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartDetailService implements ICartDetailService {
    @Autowired
    private ICartDetailRepository cartDetailRepository;

    @Autowired
    private ICartService cartService;
    @Override
    public void addCartDetail(Integer quantity, Integer productId, Integer cartId) {
         cartDetailRepository.addCartDetail(quantity, productId, cartId);
    }

    @Override
    public List<CartDetail> getCart(Integer id) {
        return cartDetailRepository.getCart(id);
    }

    @Override
    public CartDetail check(Integer userId, Integer productId) {
      return cartDetailRepository.check(userId,productId);
    }

    @Override
    public Integer checkCart(Integer id) {
        List<Cart> cartList = cartService.findAll();
        for (int i = 0; i < cartList.size(); i++) {
            if (id == cartList.get(i).getUser().getId() && cartList.get(i).getCartStatus().getId()==1){
                return cartList.get(i).getId();
            }
        }
        return -1;
    }


}
