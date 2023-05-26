import {Component, OnInit} from '@angular/core';
import {Cart} from "../model/cart";
import {ProductService} from "../service/product.service";
import {CartDetail} from "../model/cart-detail";
import {CartDetailService} from "../service/cart-detail.service";
import {ActivatedRoute} from "@angular/router";
import {TokenStorageService} from "../service/token-storage.service";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartDetail: CartDetail[] = [];

  constructor(private productService: ProductService,
              private cartDetailService: CartDetailService,
              private activatedRoute: ActivatedRoute,
              private tokenStorageService: TokenStorageService) {
  }

  ngOnInit(): void {
    this.getCarts()

  }

  getAll(cartId: number, productId: number, quantity: number) {
    this.productService.addCart(cartId, productId, 1).subscribe(data => {
      alert("thêm mới thành công")
    })
  }

  getCarts() {
    let idCustomer = this.tokenStorageService.getUser().userId;
    this.cartDetailService.getCart(idCustomer).subscribe(data => {
      this.cartDetail = data
      console.log(data)
    })
  }
}
