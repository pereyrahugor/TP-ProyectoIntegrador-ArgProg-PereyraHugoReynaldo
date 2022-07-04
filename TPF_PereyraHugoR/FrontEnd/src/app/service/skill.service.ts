import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { skill } from '../model/skill.model';

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  apiURL = 'http://localhost:8080/Habilidades/'

  constructor (private http: HttpClient) { }

  public getSkill(): Observable<skill> {
    return this.http.get<skill>(this.apiURL+ 'Buscar');
  }

  public setSkill(): Observable<skill> {
    return this.http.post<skill>(this.apiURL+ 'Crear', skill);
  }

  public deleteSkill(id: number): Observable<skill> {
    return this.http.delete<skill>(this.apiURL+ 'Borrar/' + id);
  }

  public putSkill(id: number): Observable<skill> {
    return this.http.put<skill>(this.apiURL+ 'Editar/' + id, skill);
  }
}
