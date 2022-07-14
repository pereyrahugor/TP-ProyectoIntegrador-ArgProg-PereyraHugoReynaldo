import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { social } from 'src/app/model/social.model';
import { SocialService } from 'src/app/service/social.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-logo-arg-prog',
  templateUrl: './logo-arg-prog.component.html',
  styleUrls: ['./logo-arg-prog.component.css']
})
export class LogoArgProgComponent implements OnInit {

  social: social[] = [];
  isLogged = false;

  constructor(public socialService: SocialService, private router: Router, private tokenService: TokenService) { }

  ngOnInit(): void {
    this.socialService.getSocial().subscribe(data => {this.social = data});
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    }else{
    this.isLogged = false;
    }
  }

  onLogOut(): void{
    this.tokenService.logOut();
    window.location.reload();
  }

}
