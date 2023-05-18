import {Roles} from "./roles";

export interface User {
  id?: number,
  username?: string,
  password?: string,
  name?: string,
  gender?: boolean,
  email?: string,
  dateOfBirth?: string,
  phone?: string,
  address?: string,
  roles?: Roles
}
