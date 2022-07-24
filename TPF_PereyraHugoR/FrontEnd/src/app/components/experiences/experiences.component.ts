import { Component, OnInit } from '@angular/core';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-experiences',
  templateUrl: './experiences.component.html',
  styleUrls: ['./experiences.component.css']
})
export class ExperiencesComponent implements OnInit {

  experience: experience[] = [];

  constructor(private experienceService: ExperienceService, private tokenService: TokenService) { }

  isLogged = false;

  ngOnInit(): void {
    this.getDataExperience();

    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }

  }

  getDataExperience(): void {
    this.experienceService.getExperience().subscribe(data => {this.experience = data});
  }

}
