import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StateService {
  private API_SERVER = "http://localhost:8080/state/"

  constructor(
    private httpClient: HttpClient
  ) { }

  public getStatesByCountry(idCountry): Observable<any> {
    return this.httpClient.get(this.API_SERVER+idCountry);
  }
}
