import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-admin-signup',
  templateUrl: './admin-signup.component.html',
  styleUrls: ['./admin-signup.component.css']
})
export class AdminSignupComponent implements OnInit {

  adminRegisterForm:FormGroup;
  constructor() { }

  ngOnInit() {
  
  this.adminRegisterForm=new FormGroup({
    'firstname': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
    'lastname': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
    'age': new FormControl(null, [Validators.required, Validators.maxLength(2)]),
    'gender': new FormControl(null, [Validators.required, Validators.maxLength(10)]),
    'dateOfBirth': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
    'contactNo': new FormControl(null, [Validators.required, Validators.maxLength(20)]),
    'altContactNo': new FormControl(null, [Validators.maxLength(20)]),
    'email': new FormControl(null, [Validators.maxLength(20)]),
    'password': new FormControl(null, [Validators.maxLength(20)])
  })
  console.log(this.adminRegisterForm.get('firstname'));
}

onSignUpSubmit(){
  console.log("helllo Admin signup");
  console.log(this.adminRegisterForm.value['firstname']);
}
}
