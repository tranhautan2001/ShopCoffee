import { Component, OnInit } from '@angular/core';
import {CartDetailService} from "../service/cart-detail.service";
import {Product} from "../model/product";
import {ActivatedRoute} from "@angular/router";
import {CartDetail} from "../model/cart-detail";

@Component({
  selector: 'app-cart-detail',
  templateUrl: './cart-detail.component.html',
  styleUrls: ['./cart-detail.component.css']
})
export class CartDetailComponent implements OnInit {
   product: Product;
  role: 'none';
  constructor(private cartDetailService: CartDetailService,
              private activatedRoute:ActivatedRoute) {

  }

  ngOnInit(): void {
    this.detail();

  }


  detail(){
    this.activatedRoute.paramMap.subscribe(next=>{
      let id = parseInt(next.get('id'));
      this.cartDetailService.getDetail(id).subscribe(data=>{
        this.product = data;
        console.log(data)
      })
    })
  }

}
