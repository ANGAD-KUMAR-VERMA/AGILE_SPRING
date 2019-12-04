package com.cognizant.medicare_authentication.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
