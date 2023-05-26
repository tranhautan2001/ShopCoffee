import {ProductType} from "./product-type";
import { Suppliers} from "./supplier";

export interface Product {
  id?: number,
  name?: string,
  description?: string,
  price?: number,
  quantity?: number,
  img?: string,
  productType?: ProductType,
  suppliers?: Suppliers,
}
