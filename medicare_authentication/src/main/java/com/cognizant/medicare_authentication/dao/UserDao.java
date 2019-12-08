package com.cognizant.medicare_authentication.dao;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;


public interface UserDao {
	public PasswordEncoder passwordEncoder();
	public String signUp(User user) throws UserAlreadyExistsException;
	public boolean usernameAvailable(String user);}
