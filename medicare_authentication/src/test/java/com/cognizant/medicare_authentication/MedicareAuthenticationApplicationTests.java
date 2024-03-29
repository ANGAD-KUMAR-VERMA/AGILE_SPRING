package com.cognizant.medicare_authentication;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@SpringBootTest
class MedicareAuthenticationApplicationTests {
	
	 private BasicAuthenticationFilter filter;
	    private AuthenticationManager manager;
	
   
	@Test
	void contextLoads() throws ServletException, IOException {
		
		SecurityContextHolder.clearContext();
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
                                "user", "user");
        authRequest.setDetails(new WebAuthenticationDetails(new MockHttpServletRequest()));
        Authentication authentication=new UsernamePasswordAuthenticationToken("user", "user", 
                                AuthorityUtils.createAuthorityList("ROLE_CHITTTI"));
        manager=mock(AuthenticationManager.class);
        when(manager.authenticate(authRequest)).thenReturn(authentication);
        //when(manager.authenticate(not(eq(authRequest)))).thenThrow(new BadCredentialsException(""));
        filter=new BasicAuthenticationFilter(manager);
        
        MockHttpServletRequest request=new MockHttpServletRequest();
        request.setServletPath("/authenticate");
        final MockHttpServletResponse response=new MockHttpServletResponse();
        FilterChain chain=mock(FilterChain.class);
        filter.doFilter(request, response, chain);
        verify(chain).doFilter(request,response);
        assertThat(SecurityContextHolder.getContext().getAuthentication()).isNull();


	}

}









