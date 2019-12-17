package com.cognizant.medicare_authentication.controller;



import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Doctor;
import com.cognizant.medicare_authentication.model.MedicareServices;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.service.AgentService;
import com.cognizant.medicare_authentication.service.AppUserDetailsService;
import com.cognizant.medicare_authentication.service.AppointmentService;
import com.cognizant.medicare_authentication.service.DoctorService;
import com.cognizant.medicare_authentication.service.MedicareServicesService;
import com.cognizant.medicare_authentication.service.PatientService;
import com.cognizant.medicare_authentication.service.UserService;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;

import ch.qos.logback.core.db.dialect.MsSQLDialect;



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
	
	@Autowired
	private MedicareServicesService medicareServicesService; 
	
	@Autowired
	private AppointmentService appointmentService;

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
	
	@GetMapping("/get/doctors/{username}")
	public Doctor getDoctorUsername(@PathVariable String username) {
		return doctorService.getDoctorByUsername(username);
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
	
	@GetMapping("/get/agents/{username}")
	public Agent getAgentUsername(@PathVariable String username) {
		return agentService.getAgentByUsername(username);
	}
	
	@GetMapping("/patients")
	public List<Patient> patients() {
		return (patientService.getAllPatients());
	}
	
	@GetMapping("/patients/{id}")
	public Patient getPatient(@PathVariable long id) {
		return patientService.getPatient(id);
	}
	
	@GetMapping("/get/patients/{username}")
	public Patient getPatientUsername(@PathVariable String username) {
		return patientService.getPatientByUsername(username);
	}
	
	@PutMapping("/patients")
	public void modifyPatient(@RequestBody Patient patient){
		patientService.modifyPatient(patient);
	}
	
	
	@PutMapping("/appointment/{agentId}/{doctorId}/{patientId}/{appointmentDate}")
	public boolean appointment(@PathVariable long agentId, @PathVariable long doctorId,@PathVariable long patientId,@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate appointmentDate) {
		return patientService.appointment(appointmentDate, doctorId, patientId, agentId);
	}
	
	@PutMapping("/appointments")
	public void appointment(@RequestBody Appointment appointment) {
		 appointmentService.modifyAppointment(appointment);
	}
	
	@GetMapping("/get/appointments/{patientId}")
	public List<Appointment> getAppointments(@PathVariable long patientId){
		return patientService.getAppointments(patientId);
	}
	
	@GetMapping("/get/appointment/{appointmentId}")
	public Appointment getAppointment(@PathVariable long appointmentId){
		return appointmentService.getAppointment(appointmentId);
	}
	
	@GetMapping("/admin/appointments")
	public List<Appointment> getAppointmentsForAdmin(){
		return appointmentService.getAppointments();
	}
	
	@GetMapping("/agents/appointments/{agentId}")
	public List<Appointment> getAppointmentsByAgents(@PathVariable long agentId){
		return agentService.getAppointments(agentId);
	}
	
	@GetMapping("/doctors/appointments/{doctorId}")
	public List<Appointment> getAppointmentsForDoctor(@PathVariable long doctorId){
		return doctorService.getAllAppointmentsForDoctor(doctorId);
	}
	
	
	
	@GetMapping("/medicareServices")
	public List<MedicareServices> getAllServices(){
		return medicareServicesService.getAllServices();
	}
}

