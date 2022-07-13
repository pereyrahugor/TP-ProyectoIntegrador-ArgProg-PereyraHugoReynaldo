import { Component, OnInit } from '@angular/core';
import { experience } from 'src/app/model/experience.model';
import { ExperienceService } from 'src/app/service/experience.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  experience: experience[] = [];

  constructor(public experienceService: ExperienceService) { }

  ngOnInit(): void {
    this.experienceService.getExperience().subscribe(data => {this.experience = data})
  }


}
