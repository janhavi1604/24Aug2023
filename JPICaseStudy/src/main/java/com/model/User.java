package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String emailId, String password) {
		super();
		UserName = userName;
		this.emailId = emailId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", emailId=" + emailId + ", password=" + password + "]";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="UsersName")
	private String UserName;
	@Column(name="email")
	private String emailId;
	@Column(name="password")
	private String password;

}
