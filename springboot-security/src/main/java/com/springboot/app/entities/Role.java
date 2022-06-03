package com.springboot.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role {
	
	@Id
	@GeneratedValue
	private Long rolde_id;
	private String role;
	
//	public Long getId() {
//		return rolde_id;
//	}
//	
//	public void setId(Long rolde_id) {
//		this.rolde_id = rolde_id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public Role(String name) {
//		super();
//		this.name = name;
//	}
//	
//	public Role() {
//		super();
//		this.name = name;
//	}

}
