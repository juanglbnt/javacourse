import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { CountryService } from './services/country/country.service';
import { StateService } from './services/state/state.service';
import { PersonService } from './services/person/person.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  personForm: FormGroup;
  countries: any;
  states: any;
  persons: any;

  constructor(
    public fb: FormBuilder,
    public stateService: StateService,
    public countryService: CountryService,
    public personService: PersonService
  ) {

  }
  ngOnInit(): void {
    this.personForm = this.fb.group({
      id: [''],
      name: ['', Validators.required],
      surname: ['', Validators.required],
      age: ['', Validators.required],
      country: ['', Validators.required],
      state: ['', Validators.required],
    });;

    this.countryService.getAllCountries().subscribe(resp => {
      this.countries = resp
      //console.log(resp)
    },
      error => { console.error(error) });

    this.personService.getAllPerson().subscribe(resp => {
      this.persons = resp;
    },
      error => { console.error(error) }
    );

    this.personForm.get('country')?.valueChanges.subscribe(value => {
      this.stateService.getStatesByCountry(value.id).subscribe(resp => {
        this.states = resp;
      },
        error => { console.error(error) }
      );

    })
  }

  save(): void {
    this.personService.savePerson(this.personForm.value).subscribe(resp => {
      this.personForm.reset();
      this.persons = this.persons.filter(person => resp.id != person.id);
      this.persons.push(resp);
    },
      error => { console.error(error) })
  }

  delete(person) {
    this.personService.deletePerson(person.id).subscribe(resp => {
      console.log(resp)
      if (resp === true) {
        this.persons.pop(person)
      }
    })
  }

  update(person) {
    this.personForm.setValue({
      id: person.id,
      name: person.name,
      surname: person.surname,
      age: person.age,
      country: person.country,
      state: person.state
    })
  }

}
