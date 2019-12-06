import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorSignupComponent } from './doctorSignup.component';

describe('SignupComponent', () => {
  let component: DoctorSignupComponent;
  let fixture: ComponentFixture<DoctorSignupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DoctorSignupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorSignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
