import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class DoctorSignupComponent implements OnInit {

  doctorRegisterForm:FormGroup;
  constructor() { }

  ngOnInit() {

    this.doctorRegisterForm=new FormGroup({
      'firstname': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'lastname': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'age': new FormControl(null, [Validators.required, Validators.maxLength(2)]),
      'gender': new FormControl(null, [Validators.required, Validators.maxLength(10)]),
      'dateOfBirth': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'contactNo': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
      'altContactNo': new FormControl(null, [Validators.maxLength(20)]),
      'email': new FormControl(null, [Validators.maxLength(20)]),
      'password': new FormControl(null, [Validators.maxLength(20)]),
      'address1': new FormControl(null, [Validators.maxLength(20)]),
      'address2': new FormControl(null, [Validators.maxLength(20)]),
      'city': new FormControl(null, [Validators.maxLength(20)]),
      'state': new FormControl(null, [Validators.maxLength(20)]),
      'zipcode': new FormControl(null, [Validators.maxLength(20)]),
      'degree': new FormControl(null, [Validators.maxLength(20)]),
      'speciality': new FormControl(null, [Validators.maxLength(20)]),
      'workHours': new FormControl(null, [Validators.maxLength(20)]),
      'hospitalName': new FormControl(null, [Validators.maxLength(20)]),
    })
    console.log(this.doctorRegisterForm.get('firstname'));
  }

  onSignUpSubmit(){
    console.log("helllo signup");
    console.log(this.doctorRegisterForm.value['firstname']);
  }

}
