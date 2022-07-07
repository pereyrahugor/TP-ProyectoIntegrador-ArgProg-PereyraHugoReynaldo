import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experience } from '../model/experience.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  apiURL = 'http://localhost:8080/Experiencia/'

  constructor (private http: HttpClient) { }

  public getExperience(): Observable<experience[]> {
    return this.http.get<experience[]>(this.apiURL+ 'Listar');
  }

  public setExperience(): Observable<experience> {
    return this.http.post<experience>(this.apiURL+ 'Crear', experience);
  }

  public deleteExperience(id: number): Observable<experience> {
    return this.http.delete<experience>(this.apiURL+ 'Borrar/' + id);
  }

  public putExperience(id: number): Observable<experience> {
    return this.http.put<experience>(this.apiURL+ 'Editar/' + id, experience);
  }
}
