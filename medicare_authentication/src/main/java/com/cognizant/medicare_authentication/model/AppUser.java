package com.cognizant.medicare_authentication.model;


import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class AppUser implements UserDetails {

	private User user;
	private Collection<? extends GrantedAuthority> authorities;

	
	
	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(User user, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.user = user;
		this.authorities = authorities;
	}
	
	

	public AppUser(User user) {
		super();
		this.user = user;
		System.out.println("Roles : " + user.getRoleList().stream().map(role -> role.getRoleName()).collect(Collectors.toSet()));
		
		this.authorities = user.getRoleList().stream()
				.map(role->new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
		System.out.println("In app User" + authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return user.getAdmin().isStatus() || user.getAgent().isStatus() || user.getDoctor().isStatus() || user.getPatient().isStatus();
	}

}
