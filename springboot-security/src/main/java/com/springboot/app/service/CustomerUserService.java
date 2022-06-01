package com.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.app.entities.User;
import com.springboot.app.repository.UserDetailsRepository;


@Service
public class CustomerUserService implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userDetailsRepository.findByUsername(username);
		
		if (null == user) {
			throw new UsernameNotFoundException("User Not Found with userName"+username);
		}
		return user;
	}

}
