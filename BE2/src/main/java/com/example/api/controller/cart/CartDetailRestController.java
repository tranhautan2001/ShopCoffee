package com.example.api.controller.cart;

import com.example.api.dto.cart.CartDetailDto;
import com.example.api.entity.product.CartDetail;
import com.example.api.entity.product.Product;
import com.example.api.repository.product.IProductRepository;
import com.example.api.service.cart.ICartDetailService;
import com.example.api.service.cart.ICartService;
import com.example.api.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
    @RequestMapping("api/user/cart-detail")
public class CartDetailRestController {
    @Autowired
    ICartDetailService cartDetailService;
   @Autowired
   ICartService cartService;
    @Autowired
    IProductService productService;

/*
    @PostMapping("/add")
    public ResponseEntity<?> addCart(@RequestBody CartDetail cartDetail, Integer userId, Integer productId) {
        Integer cartId = cartDetailService.checkCart(cartDetail.getId());
        CartDetail cartDetail1 = cartDetailService.check(userId, productId);
        Product product = productService.Detail(cartDetail.getProduct().getId());
        if (cartId != -1) {
            if (cartDetail1 == null){
                if (product.getQuantity()>=1){
                    if (cartDetail.getQuantity() == null){
                        return new ResponseEntity<>("errorFormatQuantity", HttpStatus.BAD_REQUEST);
                    }else if (cartDetail.getQuantity() > product.getQuantity()){
                        return new ResponseEntity<>("exceedTheAmount", HttpStatus.BAD_REQUEST);
                    } else if (cartDetail.getQuantity() < 1) {
                        return new ResponseEntity<>("errorInputQuantity", HttpStatus.BAD_REQUEST);
                    }else {
                        cartDetailService.addCartDetail(cartDetail.getQuantity(), cartDetail.getProduct().getId(),cartDetail.getCart().getId());
                        return new ResponseEntity<>(HttpStatus.OK);
                    }
                }else {
                    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
                }

            }if (cartDetail1 != null){
                Integer newQuantity = cartDetail1.getQuantity() + cartDetail1.getProduct().getQuantity();
                if (newQuantity < 1 ){
                    return new ResponseEntity<>("errorQuantity",HttpStatus.BAD_REQUEST);
                }
                return new ResponseEntity<>(HttpStatus.OK);
            }


        }if (cartId == -1){
            Integer code = cartService.checkCode();
            cartService.addCart(cartDetail.getCart().getAddressCustomer(),code,cartDetail.getCart().getName(),cartDetail.getCart().getNameCustomer(),cartDetail.getCart().getOderDate(),cartDetail.getCart().getPhoneNumberCustomer(),cartDetail.getCart().getUser().getId());
            Integer cartIdNew = cartDetailService.checkCart(cartDetail.getCart().getUser().getId());
            if (cartDetail.getQuantity() == null){
                return new ResponseEntity<>("errorFormatQuantity", HttpStatus.BAD_REQUEST);
            } else if (cartDetail.getQuantity()> product.getQuantity()){
                return new ResponseEntity<>("exceedTheAmount", HttpStatus.BAD_REQUEST);
            }else {
                cartDetailService.addCartDetail(cartDetail.getQuantity(), cartDetail.getProduct().getId(),cartIdNew);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
*/

        @PostMapping("/add")
        public ResponseEntity<?> addCart(@RequestBody CartDetailDto cartDetailDto){
              cartDetailService.addCartDetail(cartDetailDto.getQuantity(),cartDetailDto.getProductId(),cartDetailDto.getCartId());
            return new ResponseEntity<>(HttpStatus.OK);
        }



    @GetMapping("/list")
    private ResponseEntity<List<CartDetail>> getCart(@RequestParam(value = "id") Integer id) {
        List<CartDetail> cartDetails = cartDetailService.getCart(id);
        if (cartDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(cartDetails, HttpStatus.OK);
    }

}
/*
cartDetailService.addCart(cartDetail.getQuantity(), cartDetail.getProduct().getId(), cartDetail.getCart().getId());
        return new ResponseEntity<>(HttpStatus.OK);*/
