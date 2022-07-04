import { Component, OnInit } from '@angular/core';
import { skill } from 'src/app/model/skill.model';
import { SkillService } from 'src/app/service/skill.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  skill: skill = new skill("", "", "");

  constructor(public skillService: SkillService) { }

  ngOnInit(): void {
    this.skillService.getSkill().subscribe(data => {this.skill = data})
  }

}
