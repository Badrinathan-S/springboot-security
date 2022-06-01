package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.app.entities.Authority;
import com.springboot.app.entities.User;
import com.springboot.app.repository.UserDetailsRepository;

@SpringBootApplication
public class SpringbootSecurityApplication {
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityApplication.class, args);
	}
	
	@PostConstruct
	protected void init() {
		
		List<Authority> authorityList = new ArrayList<>();
		
		authorityList.add(createAuthority("USER", "User role"));
		authorityList.add(createAuthority("ADMIN", "Admin role"));
		
		User user = new User();
		
		user.setUserName("badrinathan");
		user.setFirstName("Badrinathan");
		user.setLastName("Subramani");
		
		user.setPassword(passwordEncoder.encode("badri"));
		user.setEnable(true);
		
		
		userDetailsRepository.save(user);
	}
	
	private Authority createAuthority(String roleCode, String roleDescription) {
		
		Authority authority = new Authority();
		
		authority.setRoleCode(roleCode);
		
		authority.setRoleDescription(roleDescription);
		
		
		return authority;
	}

}
