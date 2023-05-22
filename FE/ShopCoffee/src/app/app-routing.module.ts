import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CartComponent} from "./component/cart/cart.component";
import {LoginComponent} from "./component/login/login.component";
import {BodyComponent} from "./component/body/body.component";
import {CartDetailComponent} from "./component/cart-detail/cart-detail.component";


const routes: Routes = [
  {path: '', component: BodyComponent},
  {path: 'cart', component: CartComponent},
  {path: 'login1', component: LoginComponent},
  {path: 'cart/detail', component: CartDetailComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
