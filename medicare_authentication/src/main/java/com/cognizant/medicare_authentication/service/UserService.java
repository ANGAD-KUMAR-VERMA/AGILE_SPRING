package com.cognizant.medicare_authentication.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.Admin;
import com.cognizant.medicare_authentication.model.MedicareServices;
import com.cognizant.medicare_authentication.model.Role;
import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.repository.MedicareServiceRepository;
import com.cognizant.medicare_authentication.repository.RoleRepository;
import com.cognizant.medicare_authentication.repository.UserRepository;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	MedicareServiceRepository medicareServiceRepository;

	public User signUp(User newUser) throws UserAlreadyExistsException {
		User user = new User();
		user = userRepository.findByUsername(newUser.getUsername());
		if (user == null) {
			Role role = roleRepository.findByRoleId(2);
			Set<Role> roleList = new HashSet<>();
			roleList.add(role);
			newUser.setRoleList(roleList);
			newUser.setPassword((new BCryptPasswordEncoder()).encode(newUser.getPassword()));
			userRepository.save(newUser);
			return newUser;
		} else {

			return user;
		}

	}

	public boolean usernameAvailable(String username) {
		return userRepository.findByUsername(username) == null ? true : false;
	}

	public User getUser(String username) {
		return userRepository.findByUsername(username);
	}

	public void modifyUser(User user,String username) {
		System.out.println(user);
		User newUser = userRepository.findByUsername(username);
		newUser.setUsername(user.getUsername());
		newUser.setPassword(user.getPassword());
		newUser.setRoleList(user.getRoleList());
		newUser.setStatus(user.getStatus());
		Set<Role> roleList = user.getRoleList();
		int roleId = 0;
		for (Role role : roleList) {
			roleId = role.getRoleId();
		}
		switch(roleId) {
		case 1:{  newUser.setAdmin(user.getAdmin()); }
		case 2 :{ newUser.setPatient(user.getPatient());}
		case 3: { newUser.setDoctor(user.getDoctor());}
		case 4: { newUser.setAgent(user.getAgent());}
		}
		
		userRepository.save(newUser);
	}
	
	public List<MedicareServices> getAllServices()
	{
		return medicareServiceRepository.findAll();
	}
	
}
