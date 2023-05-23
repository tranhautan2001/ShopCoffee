import { Component, OnInit } from '@angular/core';
import {ProductTypeService} from "../service/product-type.service";
import {ProductService} from "../service/product.service";
import {Product} from "../model/product";

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {
  searchInput = '';
  productList:  Product[];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.getAll();
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
}
