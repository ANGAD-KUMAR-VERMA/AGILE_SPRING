package com.cognizant.medicare_authentication.service;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Admin;
import com.cognizant.medicare_authentication.model.Role;
import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.repository.RoleRepository;
import com.cognizant.medicare_authentication.repository.UserRepository;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;



@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	public User signUp(User newUser) throws UserAlreadyExistsException{
		User user = new User();
		user = userRepository.findByUsername(newUser.getUsername());
		if(user==null) {
			Role role = roleRepository.findByRoleId(2);
			Set<Role> roleList = new HashSet<>();
			roleList.add(role);
			newUser.setRoleList(roleList);
			newUser.setPassword((new BCryptPasswordEncoder()).encode(newUser.getPassword()));
			userRepository.save(newUser);
			return newUser;
		}
		else {
			
			return user;
		}
		
	}
	
	public boolean usernameAvailable(String username) {
		return userRepository.findByUsername(username) == null?true:false;
	}
}

