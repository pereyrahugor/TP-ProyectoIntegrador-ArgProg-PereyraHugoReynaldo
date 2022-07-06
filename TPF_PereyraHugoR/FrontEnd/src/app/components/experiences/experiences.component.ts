import { Component, OnInit } from '@angular/core';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-experiences',
  templateUrl: './experiences.component.html',
  styleUrls: ['./experiences.component.css']
})
export class ExperiencesComponent implements OnInit {

  experience: experience[] = [];

  constructor(public experienceService: ExperienceService) { }

  ngOnInit(): void {
    this.experienceService.getExperience().subscribe(data => {this.experience = data})
  }

}
