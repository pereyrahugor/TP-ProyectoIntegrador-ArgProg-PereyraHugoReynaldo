import { Component, OnInit } from '@angular/core';
import { social } from 'src/app/model/social.model';
import { SocialService } from 'src/app/service/social.service';

@Component({
  selector: 'app-logo-arg-prog',
  templateUrl: './logo-arg-prog.component.html',
  styleUrls: ['./logo-arg-prog.component.css']
})
export class LogoArgProgComponent implements OnInit {

  social: social[] = [];

  constructor(public socialService: SocialService) { }

  ngOnInit(): void {
    this.socialService.getSocial().subscribe(data => {this.social = data})
  }
}
