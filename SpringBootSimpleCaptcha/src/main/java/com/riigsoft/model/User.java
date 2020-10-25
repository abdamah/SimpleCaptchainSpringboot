package com.riigsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	
	@Transient
	private String hidden;
	
	@Transient
	private String captcha;
	
	@Transient
	private String image;
	
}
