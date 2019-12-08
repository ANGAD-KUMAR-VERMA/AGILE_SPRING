package com.cognizant.medicare_authentication.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Repository;

import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;




@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	InMemoryUserDetailsManager inMemoryUserDetailsManager;

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public String signUp(User user) throws UserAlreadyExistsException {
		if (!inMemoryUserDetailsManager.userExists(user.getUsername())) {
			inMemoryUserDetailsManager
					.createUser(org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
							.password(passwordEncoder().encode(user.getPassword())).roles("USER").build());
		return user.getUsername();
		} else {
			throw new UserAlreadyExistsException();
		}
	}
	@Override
	public boolean usernameAvailable(String user){
		if (!inMemoryUserDetailsManager.userExists(user)) {
		return true;
		} else {
			return false;
		}
	}

	
}
