import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { BodyComponent } from './component/body/body.component';
import { FooterComponent } from './component/footer/footer.component';
import { CartDetailComponent } from './component/cart-detail/cart-detail.component';
import { CartComponent } from './component/cart/cart.component';
import { ProductComponent } from './component/product/product.component';
import { ProductTypeComponent } from './component/product-type/product-type.component';
import { SupplierComponent } from './component/supplier/supplier.component';
import { CartStatusComponent } from './component/cart-status/cart-status.component';
import { LoginComponent } from './component/login/login.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BodyComponent,
    FooterComponent,
    CartDetailComponent,
    CartComponent,
    ProductComponent,
    ProductTypeComponent,
    SupplierComponent,
    CartStatusComponent,
    LoginComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        ReactiveFormsModule,
      HttpClientModule,

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
