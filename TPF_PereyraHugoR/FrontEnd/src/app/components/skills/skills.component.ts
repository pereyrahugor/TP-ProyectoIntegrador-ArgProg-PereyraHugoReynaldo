import { Component, OnInit } from '@angular/core';
import { skill } from 'src/app/model/skill.model';
import { SkillService } from 'src/app/service/skill.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  skill: skill[] = [];
 
  constructor(public skillService: SkillService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.getDataSkill();

    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }

  }

  getDataSkill(): void {
    this.skillService.getSkill().subscribe(data => {this.skill = data});
  }

}
