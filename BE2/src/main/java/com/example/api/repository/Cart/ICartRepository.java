package com.example.api.repository.Cart;

import com.example.api.entity.product.Cart;
import com.example.api.entity.product.CartDetail;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
    @JsonBackReference
    @Query(value = "insert into cart (address_customer, code, name, name_customer, oder_date, phone_number_customer, user_id)  value (:address_customer, :code , :name, :name_customer ,:oder_date, :phone_number_customer ,:user_id)", nativeQuery = true)
    void addCart(@Param("address_customer")String address_customer,@Param("code") Integer code, @Param("name") String name,@Param("name_customer") String name_customer,@Param("oder_date") String oder_date, @Param("phone_number_customer") String phone_number_customer,@Param("user_id") Integer user_id);

    List<Cart> findAll();


}
