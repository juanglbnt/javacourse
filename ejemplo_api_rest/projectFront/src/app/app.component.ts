import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CountryService } from './services/country/country.service';
import { StateService } from './services/state/state.service';
import { PersonService } from './services/person/person.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  personForm: FormGroup;

  constructor(
    public fb: FormBuilder,
    public stateService: StateService,
    public countryService: CountryService,
    public personService: PersonService
  ){

  }
  ngOnInit(): void {
    this.personForm = this.fb.group({
      name : ['', Validators.required],
      surname : ['', Validators.required],
      age : ['', Validators.required],
      country : ['', Validators.required],
      state : ['', Validators.required],
    })
}

}
