package com.example.api.dto.cart;

import com.example.api.entity.product.Cart;
import com.example.api.entity.product.Product;

public class CartDetailDto {
    private Integer quantity;
    private Integer productId;
    private Integer cartId;

    public CartDetailDto() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
}
