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

  public setExperience(exp: experience): Observable<any> {
    return this.http.post<any>(this.apiURL+ 'Crear/', exp);
  }

  public deleteExperience(id: number): Observable<any> {
    return this.http.delete<any>(this.apiURL+ 'Borrar/' + id);
  }

  public putExperience(id: number, exp: experience): Observable<any> {
    return this.http.put<any>(this.apiURL+ 'Editar/' + id, exp);
  }
}
