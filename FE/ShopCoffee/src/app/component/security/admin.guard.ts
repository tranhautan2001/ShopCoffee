
import {Injectable} from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router} from '@angular/router';
import {Observable} from 'rxjs';
import {TokenStorageService} from "../service/token-storage.service";

@Injectable({
  providedIn: 'root'
})
export class AdminGuard implements CanActivate {
  constructor(private token: TokenStorageService,
              private router: Router) {
  }

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    if (this.token.getToken()) {

      if (this.token.getUser().roles[0].authority === 'ROLE_ADMIN'  && this.token.isLogger()) {
        return true;
      }
      else {
        console.log("zzzzzzzzzzzzzzzzzzzzzzzz:",this.token.getUser().roles[0].authority)

        this.router.navigateByUrl('/error');
        return false;
      }
    } else {
      this.router.navigateByUrl('/login1');
      return false;
    }
  }
}
