import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {TokenService} from "./token.service";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient,private tokenService:TokenService) { }

  login(obj): Observable<any> {
    return this.http.post<any>('http://localhost:8080/login',obj)
  }
 /* updateUser(obj):Observable<any> {
    return this.http.post('http://localhost:8080/api/auth/update',{username: this.tokenService.getUsername(),
      name: obj.name,phoneNumber: obj.phoneNumber,email: obj.email,age: obj.age,gender: obj.gender,
      dateOfBirth: obj.dateOfBirth,avatar: obj.avatar,address: obj.address})
  }
  register(obj):Observable<any> {
    return this.http.post('http://localhost:8080/api/auth/signup',obj);
  }
  changePassword(obj):Observable<any> {
    return this.http.post('http://localhost:8080/api/auth/change-password',{username: this.tokenService.getUsername(),password: obj.password,newPassword:obj.newPassword,confirmPassword:obj.confirmPassword})
  }

  profile(id):Observable<any> {
    return this.http.get<any>('http://localhost:8080/api/auth/profile/'+id);
  }*/
}
