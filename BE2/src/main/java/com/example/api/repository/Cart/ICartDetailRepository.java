package com.example.api.repository.Cart;

import com.example.api.entity.product.CartDetail;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ICartDetailRepository extends JpaRepository<CartDetail , Integer> {
    @Modifying
    @Transactional
    @Query(value = "insert into cart_detail(quantity, product_id, cart_id) values (:quantity, :productId, :cartId)", nativeQuery = true)
    void addCartDetail(@Param("quantity") Integer quantity, @Param("productId") Integer productId, @Param("cartId") Integer cartId);

    @Query(value = "select * from cart_detail join cart c on c.id = cart_detail.cart_id join product p on p.id = cart_detail.product_id join user u on u.id = c.user_id where u.id =:id", nativeQuery = true)
    List<CartDetail> getCart(@Param("id") Integer id);

    @Query(value = "select * from cart_detail join cart c on c.id = cart_detail.cart_id join product p on p.id = cart_detail.product_id join user u on u.id = c.user_id where (u.id =:userId and p.id =:productId);", nativeQuery = true)
    CartDetail check(@Param("userId") Integer userId, @Param("productId") Integer productId);


}
