import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  apiURL = 'http://localhost:8080/Persona/'

  constructor (private http: HttpClient) { }

  public getPersona(): Observable<persona> {
    return this.http.get<persona>(this.apiURL+ 'Listar');
  }

  public setPersonas(): Observable<persona> {
    return this.http.post<persona>(this.apiURL+ 'Crear', persona);
  }

  public deletePersona(id: number): Observable<persona> {
    return this.http.delete<persona>(this.apiURL+ 'Borrar/' + id);
  }

  public putPersona(id: number): Observable<persona> {
    return this.http.put<persona>(this.apiURL+ 'Editar/' + id, persona);
  }

}
