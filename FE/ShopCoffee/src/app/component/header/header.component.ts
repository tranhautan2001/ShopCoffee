import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from "../service/token-storage.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLogin: boolean = false;

  constructor(private tokenStorageService: TokenStorageService) {
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
}
