package com.cognizant.medicare_authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

	
}
