import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Jedi } from '../models/jedi';

const baseUrl = 'http://localhost:8080/api/jedi';

@Injectable({
  providedIn: 'root'
})

export class JediService {

  constructor(private http: HttpClient) { }

  findAll(): Observable<Jedi[]> {
    return this.http.get<Jedi[]>(`${baseUrl}`);
  }

  findById(id: any): Observable<Jedi> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  create(jedi: Jedi): Observable<Jedi> {
    return this.http.post(`${baseUrl}`, jedi);
  }

  update(jedi: Jedi): Observable<Jedi> {
    return this.http.put(`${baseUrl}`, jedi);
  }

  deleteById(id: any): Observable<Jedi> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<Jedi> {
    return this.http.delete(`${baseUrl}`);
  }

}
