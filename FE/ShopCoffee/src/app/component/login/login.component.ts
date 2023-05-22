import { Component, OnInit } from '@angular/core';
import {TokenService} from "../service/token.service";
import {FormControl, FormGroup} from "@angular/forms";
import {LoginService} from "../service/login.service";
import {ShareService} from "../service/share.service";
import {Router} from "@angular/router";
import {LogIn} from "../model/log-in";
import {TokenStorageService} from "../service/token-storage.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  form = new FormGroup({
    username: new FormControl(),
    password: new FormControl()
  })
  constructor(private loginService: LoginService,
              private tokenService: TokenService,
              private shareService: ShareService,
              private router: Router,
              private tokenStorageService:TokenStorageService) { }

  ngOnInit(): void {
  }
  login(){
    let login:LogIn = this.form.value;
    this.loginService.login(login).subscribe(next=>{
      console.log(next.token);
      this.tokenStorageService.saveTokenLocal(next.token);
      alert("Đăng nhập thành công")

      this.router.navigateByUrl("")
    })
  }


// login(){
//   this.message = ''
//   this.loginService.login(this.form.value).subscribe(next => {
//       this.tokenService.setIsLoggedIn(next.name);
//       this.shareService.sendClickEvent();
//       // location.href='http://localhost:4200/'
//     alert("thành công")
//       this.router.navigateByUrl("")
//     }, error => {
//       if (error.error.message) {
//         this.message = error.error.message
//       } else {
//         for (let i = 0; i < error.error.length; i++) {
//           this.message = error.error[i].defaultMessage;
//         }
//       }
//     }
//   )
// }
}
