package com.cognizant.medicare_authentication.service;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.medicare_authentication.model.AppUser;
import com.cognizant.medicare_authentication.model.Role;
import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.repository.RoleRepository;
import com.cognizant.medicare_authentication.repository.UserRepository;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;



@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	
	
	public AppUserDetailsService() {
		super();
	}

	public AppUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public AppUserDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		AppUser appUser;
		if (user == null) {
			throw new UsernameNotFoundException("Username not found");
		} else {
			appUser = new AppUser(user);
		}
		return appUser;
	}
	
	public User signUp(User newUser) throws UserAlreadyExistsException{
		User user;
		user = userRepository.findByUsername(newUser.getUsername());
		if(user==null) {
			Role role = roleRepository.findByRoleId(2);
			Set<Role> roleList = new HashSet<Role>();
			roleList.add(role);
			newUser.setRoleList(roleList);
			String password = newUser.getPassword();
			newUser.setPassword(passwordEncoder().encode(password));
			userRepository.save(newUser);
			return newUser;
		}else {
			throw new UserAlreadyExistsException();
		}
	}
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
