package com.cognizant.medicare_authentication.security;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.cognizant.medicare_authentication.service.AppUserDetailsService;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AppUserDetailsService appUserDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.userDetailsService(inMemoryUserDetailsManager());
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.cors();
		httpSecurity.csrf().disable()
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/authenticate")
		.permitAll()
	    .antMatchers("/users/**")
		.permitAll()
		.antMatchers("/securityQue/**")
		.permitAll()
		.antMatchers("/medicareServices/**")
		.permitAll()
		.antMatchers(HttpMethod.GET,"/menu-items")
		.permitAll()
//		.antMatchers("/carts/**")
//		.hasAnyRole("ROLE_USER")
		.anyRequest()
		.authenticated()
		.and().addFilter(new JwtAuthorizationFilter(authenticationManager()));
	}

	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		List<UserDetails> userDetailsList = new ArrayList<>();
		userDetailsList.add(User.withUsername("user").password(passwordEncoder().encode("pwd")).roles("USER").build());
		userDetailsList
				.add(User.withUsername("admin").password(passwordEncoder().encode("pwd")).roles("ADMIN").build());
		userDetailsList.add(User.withUsername("doctor").password(passwordEncoder().encode("pwd")).roles("DOCTOR").build());
		userDetailsList
				.add(User.withUsername("agent").password(passwordEncoder().encode("pwd")).roles("AGENT").build());
		return new InMemoryUserDetailsManager(userDetailsList);
	}
}

