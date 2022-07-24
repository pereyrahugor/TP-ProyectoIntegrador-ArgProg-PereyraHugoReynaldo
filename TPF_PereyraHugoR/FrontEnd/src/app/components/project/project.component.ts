import { Component, OnInit } from '@angular/core';
import { project } from 'src/app/model/project.model';
import { ProjectService } from 'src/app/service/project.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  project: project[] = [];

  constructor(public projectService: ProjectService, private tokenService: TokenService) { }

  isLogged = false;  

  ngOnInit(): void {
    this.getDataProject();

    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }

  }

  getDataProject(): void {
    this.projectService.getProject().subscribe(data => {this.project = data})
  }

}
