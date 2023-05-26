import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";
import {CartDetail} from "../model/cart-detail";

@Injectable({
  providedIn: 'root'
})
export class CartDetailService {

  constructor(private http: HttpClient) { }
  getDetail(id: number): Observable<any>{
    return this.http.get<Product>("http://localhost:8080/api/user/product/detail?id=" +id)
  }
  getCart(id: number):Observable<any>{
    return this.http.get<CartDetail[]>("http://localhost:8080/api/user/cart-detail/list?id=" +id)
  }
}
