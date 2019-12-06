import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './site/login/login.component';
import { DoctorSignupComponent } from './site/doctorSignup/doctorSignup.component';
import { AdminSignupComponent } from './site/admin-signup/admin-signup.component';
import { PatientSignupComponent } from './site/patient-signup/patient-signup.component';
import { AgentSignupComponent } from './site/agent-signup/agent-signup.component';



const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'doctorSignup', component:DoctorSignupComponent},
  {path:'AdminSignup', component:AdminSignupComponent},
  {path:'PatientSignup', component:PatientSignupComponent},
  {path:'AgentSignup', component:AgentSignupComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
