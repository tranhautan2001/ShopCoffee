import {Component, OnInit} from '@angular/core';
import {  TokenStorageService} from "../service/token-storage.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLogin: boolean = false;

  constructor(private tokenStorageService: TokenStorageService,
              private router:Router) {
  }

  ngOnInit(): void {
    this.checkLogIn();
  }

  checkLogIn(){
    this.isLogin = this.tokenStorageService.isLogger();
  }

  logOut() {
    this.tokenStorageService.signOut();
    this.isLogin = false;
  }

  cart() {
    let obj: any = this.tokenStorageService.getUser();
    if (this.isLogin && obj.roles[0].authority == 'ROLE_USER') {
      this.router.navigateByUrl('cart');
    } else if (this.isLogin && obj.roles[0].authority == 'ROLE_ADMIN') {
      console.log(this.isLogin && obj.roles[0].authority)

      this.router.navigateByUrl('cart-management');
    }
  }
}
