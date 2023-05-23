import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {

  }
  getAllProduct(name: string, product_type_id: number){
   return this.http.get<Product[]>("http://localhost:8080/api/user/product/list?name=" + name + "&product_type_id=" + product_type_id)
  }
}
