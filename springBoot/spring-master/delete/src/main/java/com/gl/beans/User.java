package com.gl.beans;

public class User
{
	private int userId;
	private String userName;
	private String userpassword;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String role;
	
	
	public User() {
		super();
	}
	public User(int userId, String userName, String userpassword, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userpassword = userpassword;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
