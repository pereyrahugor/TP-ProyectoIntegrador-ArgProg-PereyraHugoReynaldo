import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { project } from '../model/project.model';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  apiURL = 'http://localhost:8080/Proyectos/'

  constructor (private http: HttpClient) { }

  public getProject(): Observable<project[]> {
    return this.http.get<project[]>(this.apiURL+ 'Listar');
  }

  public setProject(): Observable<project> {
    return this.http.post<project>(this.apiURL+ 'Crear', project);
  }

  public deleteProject(id: number): Observable<project> {
    return this.http.delete<project>(this.apiURL+ 'Borrar/' + id);
  }

  public putProject(id: number): Observable<project> {
    return this.http.put<project>(this.apiURL+ 'Editar/' + id, project);
  }
}
