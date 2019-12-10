package com.cognizant.medicare_authentication.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.Agent;
import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.service.AgentService;
import com.cognizant.medicare_authentication.service.AppUserDetailsService;
import com.cognizant.medicare_authentication.service.DoctorService;
import com.cognizant.medicare_authentication.service.PatientService;
import com.cognizant.medicare_authentication.service.UserService;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;



@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private AppUserDetailsService userService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private AgentService agentService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private UserService userServiceUserAvailability;

	@PostMapping
	public User signUp(@RequestBody @Valid User user) throws UserAlreadyExistsException {
		System.out.println(user);
		return userService.signUp(user);
	}

	@GetMapping("/{username}")
	public boolean usernameAvailable(@PathVariable String username) {
		System.out.println(username);
		return (userServiceUserAvailability.usernameAvailable(username));
	}
	
	@GetMapping("/get/{username}")
	public User getUser(@PathVariable String username) {
		return (userServiceUserAvailability.getUser(username));
	}
	
	@PutMapping("/{username}")
	public void modifyUser(@RequestBody User user, @PathVariable String username) {System.out.println(username);
		 userServiceUserAvailability.modifyUser(user,username);
	}
	
	
	@GetMapping("/doctors")
	public List<Doctor> doctors() {
		return (doctorService.getAllDoctors());
	}
	
	@GetMapping("/doctors/{id}")
	public Doctor getDoctor(@PathVariable long id) {
		return doctorService.getDoctor(id);
	}
	
	@PutMapping("/doctors")
	public void modifyDoctor(@RequestBody Doctor doctor){
		doctorService.modifyDoctor(doctor);
	}
	
	@GetMapping("/agents")
	public List<Agent> agents() {
		return (agentService.getAllAgents());
	}
	
	@GetMapping("/agents/{id}")
	public Agent getAgent(@PathVariable long id) {
		return agentService.getAgent(id);
	}
	
	@PutMapping("/agents")
	public void modifyAgent(@RequestBody Agent agent){
		agentService.modifyAgent(agent);
	}
	
	@DeleteMapping("/agents/{id}")
	public void deleteAgent(@RequestBody Agent agent)
	{
		agentService.deleteAgent(agent);
	}
	
	@GetMapping("/patients")
	public List<Patient> patients() {
		return (patientService.getAllPatients());
	}
	
	@GetMapping("/patients/{id}")
	public Patient getPatient(@PathVariable long id) {
		return patientService.getPatient(id);
	}
	
	@PutMapping("/patients")
	public void modifyPatient(@RequestBody Patient patient){
		patientService.modifyPatient(patient);
	}
	
	
	

}

