import { Component, OnInit } from '@angular/core';
import {ProductTypeService} from "../service/product-type.service";
import {ProductService} from "../service/product.service";
import {Product} from "../model/product";
import {ProductType} from "../model/product-type";
import {CartDetailService} from "../service/cart-detail.service";
import {TokenStorageService} from "../service/token-storage.service";

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {
  searchInput = '';
  productList:  Product[];
  productTypeList:  ProductType[];
  product: any;

  constructor(private productService: ProductService,
              private productTypeService: ProductTypeService,
              private cartDetailService: CartDetailService,
              private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
    this.getAll();
    this.productTypeService.getAll().subscribe(next =>{
      this.productTypeList = next
      console.log(next)

    })
  }


  getAll(){
   this.productService.getAllProduct(this.searchInput,0).subscribe(next =>{
     this.productList = next;
     console.log(next)
   })
  }

  search(name: string) {
    this.searchInput = name;
    this.productList = [];
    this.getAll();
  }

  addCarts(productId: number) {
    debugger
    let idCustomer = this.tokenStorageService.getUser().userId;
    this.productService.addCart(idCustomer, productId, 1).subscribe(data => {
      console.log(data + 'zzzzzzzzzzzz')
      alert("thêm mới thành công")
    })

  }

}
