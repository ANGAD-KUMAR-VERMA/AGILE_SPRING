package com.cognizant.medicare_authentication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRoleId(int id);
}

