import {User} from "./user";
import {CartStatus} from "./cart-status";

export interface Cart {
  id?: number,
  name?: string,
  code?: number,
  oderDate?: string,
  nameCustomer?: string,
  addressCustomer?: string,
  phoneNumberCustomer?: string,
  user?: User,
  cartStatus?:CartStatus

}
