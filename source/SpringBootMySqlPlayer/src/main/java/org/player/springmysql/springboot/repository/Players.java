package org.player.springmysql.springboot.repository;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Players {
	@Id
	
	@Column(name = "id")
	private int id;
	@Column(name = "UserName")
	private String username;
	@Column(name = "Name")
	private String name;
	@Column(name = "LastName")
	private String lastname;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Active")
	private String active;
	public Players() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
