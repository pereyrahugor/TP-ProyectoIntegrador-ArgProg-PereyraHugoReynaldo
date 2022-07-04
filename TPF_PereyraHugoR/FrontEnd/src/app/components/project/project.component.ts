import { Component, OnInit } from '@angular/core';
import { project } from 'src/app/model/project.model';
import { ProjectService } from 'src/app/service/project.service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  project: project = new project("", "", "");

  constructor(public projectService: ProjectService) { }

  ngOnInit(): void {
    this.projectService.getProject().subscribe(data => {this.project = data})
  }

}
