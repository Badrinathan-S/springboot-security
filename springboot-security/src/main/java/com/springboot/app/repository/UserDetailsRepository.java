package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entities.User;


@Repository
public interface UserDetailsRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
