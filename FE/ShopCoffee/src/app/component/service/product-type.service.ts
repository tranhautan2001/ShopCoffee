import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductTypeService {

  constructor(private http: HttpClient) { }
  getAll():Observable<any>{
    return this.http.get<any>("http://localhost:8080/api/user/product-type")
  }
}
