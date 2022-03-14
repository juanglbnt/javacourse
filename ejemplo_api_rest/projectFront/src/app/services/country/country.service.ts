import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private API_SERVER = "http://localhost:8080/country/"

  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllCountries(): Observable<any> {
    return this.httpClient.get(this.API_SERVER)
  }
}
