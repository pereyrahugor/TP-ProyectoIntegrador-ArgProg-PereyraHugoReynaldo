import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { social } from '../model/social.model';

@Injectable({
  providedIn: 'root'
})
export class SocialService {

  apiURL = 'http://localhost:8080/RedesSociales/'

  constructor (private http: HttpClient) { }

  public getSocial(): Observable<social> {
    return this.http.get<social>(this.apiURL+ 'Buscar');
  }

  public setSocial(): Observable<social> {
    return this.http.post<social>(this.apiURL+ 'Crear', social);
  }

  public deleteSocial(id: number): Observable<social> {
    return this.http.delete<social>(this.apiURL+ 'Borrar/' + id);
  }

  public putSocial(id: number): Observable<social> {
    return this.http.put<social>(this.apiURL+ 'Editar/' + id, social);
  }
}
