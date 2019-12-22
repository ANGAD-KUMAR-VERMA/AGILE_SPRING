package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Agent;
import com.cognizant.medicare_authentication.model.Appointment;
import com.cognizant.medicare_authentication.model.Patient;
import com.cognizant.medicare_authentication.repository.AgentRepository;
import com.cognizant.medicare_authentication.repository.AppointmentRespository;

@Service
public class AgentService {
	
	@Autowired
	private AgentRepository agentRepository;
	
	@Autowired
	private AppointmentRespository appointmentRespository;

	public List<Agent> getAllAgents(){
		return agentRepository.findAll();
	}

	public Agent getAgent(long id) {
		
		return agentRepository.findById(id).get();
	}
	
public Agent getAgentByUsername(String username) {
		
		return agentRepository.findByUsername(username);
	}

	public void modifyAgent(Agent agent) {
		System.out.println(agent);
		Agent newAgent = agentRepository.findByUsername(agent.getUsername());
		newAgent.setUsername(agent.getUsername());
		newAgent.setFirstname(agent.getFirstname());
		newAgent.setLastname(agent.getLastname());
		newAgent.setPassword(agent.getPassword());
		newAgent.setAge(agent.getAge());
		newAgent.setGender(agent.getGender());
		newAgent.setDateOfBirth(agent.getDateOfBirth());
		newAgent.setContactNo(agent.getContactNo());
		newAgent.setAltContactNo(agent.getAltContactNo());
		newAgent.setEmail(agent.getEmail());
		newAgent.setAddress1(agent.getAddress1());
		newAgent.setAddress2(agent.getAddress2());
		newAgent.setCity(agent.getCity());
		newAgent.setState(agent.getState());
		newAgent.setZipcode(agent.getZipcode());
		newAgent.setStatus(agent.isStatus());
		
		agentRepository.save(newAgent);
	}
	
	public void deleteAgent(Agent agent)
	{
		agentRepository.delete(agent);
	}
	
	public List<Appointment> getAppointments(long agentId){
		Agent agent = agentRepository.findById(agentId).get();
		return appointmentRespository.findByAgent(agent);
	}
}
