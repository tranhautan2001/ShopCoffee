import {Roles} from "./roles";

export interface User {
  id?: number,
  name?: string,
  gender?: boolean,
  email?: string,
  date_of_birth?: string,
  phone_number?: string,
  address?: string,
  username?: string,
  password?: string,
  expiryTime?: string,
  otpSecret?: string,
  roles?: Roles
}
