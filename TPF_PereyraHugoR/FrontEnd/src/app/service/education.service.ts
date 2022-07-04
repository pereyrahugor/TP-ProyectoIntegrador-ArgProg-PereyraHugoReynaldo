import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { education } from '../model/education.model';

@Injectable({
  providedIn: 'root'
})
export class EducationService {

  apiURL = 'http://localhost:8080/Educacion/'

  constructor (private http: HttpClient) { }

  public getEducation(): Observable<education> {
    return this.http.get<education>(this.apiURL+ 'Buscar');
  }

  public setEducation(): Observable<education> {
    return this.http.post<education>(this.apiURL+ 'Crear', education);
  }

  public deleteEducation(id: number): Observable<education> {
    return this.http.delete<education>(this.apiURL+ 'Borrar/' + id);
  }

  public putEducation(id: number): Observable<education> {
    return this.http.put<education>(this.apiURL+ 'Editar/' + id, education);
  }
}
