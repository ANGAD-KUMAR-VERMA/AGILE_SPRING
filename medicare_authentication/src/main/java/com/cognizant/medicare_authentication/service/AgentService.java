package com.cognizant.medicare_authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Agent;
import com.cognizant.medicare_authentication.repository.AgentRepository;

@Service
public class AgentService {
	
	@Autowired
	private AgentRepository agentRepository;

	public List<Agent> getAllAgents(){
		return agentRepository.findAll();
	}

	public Agent getAgent(long id) {
		
		return agentRepository.findById(id).get();
	}

	public void modifyAgent(Agent agent) {
		agentRepository.save(agent);
	}
}
