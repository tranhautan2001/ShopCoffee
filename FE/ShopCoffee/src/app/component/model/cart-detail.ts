import {Product} from "./product";
import {Cart} from "./cart";

export interface CartDetail {
  id?: number,
  quantity?: number,
  product?:Product,
  cart?:Cart,
}
