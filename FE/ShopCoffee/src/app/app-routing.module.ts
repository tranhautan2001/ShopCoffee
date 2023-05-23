import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CartComponent} from "./component/cart/cart.component";
import {LoginComponent} from "./component/login/login.component";
import {BodyComponent} from "./component/body/body.component";
import {CartDetailComponent} from "./component/cart-detail/cart-detail.component";
import {AdminGuard} from "./component/security/admin.guard";
import {CartManagementComponent} from "./cart-management/cart-management.component";
import {UserGuard} from "./component/security/user.guard";


const routes: Routes = [
  {path: '', component: BodyComponent},
  {canActivate: [UserGuard],path: 'cart',  component: CartComponent},
  {canActivate: [AdminGuard],path: 'cart-management',  component: CartManagementComponent},
  {path: 'login1', component: LoginComponent},
  {path: 'cart/detail', component: CartDetailComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
