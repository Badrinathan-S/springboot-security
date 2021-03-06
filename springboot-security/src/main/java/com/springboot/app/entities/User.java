package com.springboot.app.entities;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	
//	public User() {
//		
//	}
//	
//	public Long getId() {
//		return id;
//	}
//	
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
//	public String getFirstName() {
//		return firstName;
//	}
//	
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	
//	public String getLastName() {
//		return lastName;
//	}
//	
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public Collection<Role> getRoles() {
//		return roles;
//	}
//	
//	public void setRoles(Collection<Role> roles) {
//		this.roles = roles;
//	}
//	
//	public User(String firstName, String lastName, String email, String password, Collection<Role> roles) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.password = password;
//		this.roles = roles;
//	}

}
