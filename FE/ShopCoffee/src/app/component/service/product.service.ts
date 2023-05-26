import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Product} from "../model/product";
import {CartDetail} from "../model/cart-detail";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {

  }
  getAllProduct(name: string, product_type_id: number){
   return this.http.get<Product[]>("http://localhost:8080/api/user/product/list?name=" + name + "&product_type_id=" + product_type_id)
  }
  addCart(userId: number, productId: number, quantity: number){
    return this.http.post("http://localhost:8080/api/user/cart-detail/add" ,{userId : userId, productId: productId, quantity: quantity})
  }
}
