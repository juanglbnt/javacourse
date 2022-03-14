import { Injectable } from '@angular/core';
import { observable, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
  private API_SERVER = "http://localhost:8080/person/"
  constructor(private httpClient: HttpClient) { }

  public getAllPerson(): Observable<any> {
    return this.httpClient.get(this.API_SERVER);
  }

  public savePerson(person: any): Observable<any> {
    return this.httpClient.post(this.API_SERVER, person)
  }

  public deletePerson(id): Observable<any> {
    return this.httpClient.delete(this.API_SERVER + "delete/" + id);
  }
}

