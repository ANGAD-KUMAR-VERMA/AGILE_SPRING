package com.cognizant.medicare_authentication.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicare_authentication.model.User;
import com.cognizant.medicare_authentication.service.AppUserDetailsService;
import com.cognizant.medicare_authentication.service.UserService;
import com.cognizant.medicare_authentication.util.UserAlreadyExistsException;



@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private AppUserDetailsService userService;
	
	@Autowired
	private UserService userServiceUserAvailability;

	@PostMapping
	public User signUp(@RequestBody @Valid User user) throws UserAlreadyExistsException {
		System.out.println(user);
		return userService.signUp(user);
	}

	@GetMapping("/{username}")
	public boolean usernameAvailable(@PathVariable String username) {
		System.out.println(username);
		return (userServiceUserAvailability.usernameAvailable(username));
	}
}

