package com.example.api.controller.cart;

import com.example.api.entity.product.CartDetail;
import com.example.api.entity.product.Product;
import com.example.api.service.cart.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/user/cart")
public class CartRestController {
   /* @Autowired
    ICartService cartService;

        @PostMapping("/add")
    public ResponseEntity<?> addCart(@RequestBody CartDetail cartDetail) {
        CartDetail cartDetail1 = cartService.(cartDetail.getQuantity(), cartDetail.getProduct().getId(), cartDetail.getCart().getId());
        if (cartDetail1 == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list")
    private ResponseEntity<List<CartDetail>> getCart(@RequestParam(value = "id") Integer id) {
        List<CartDetail> cartDetails = cartService.(id);
        return new ResponseEntity<>(cartDetails, HttpStatus.OK);
    }*/
}
