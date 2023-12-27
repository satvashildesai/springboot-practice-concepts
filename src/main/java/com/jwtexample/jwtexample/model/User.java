package com.jwtexample.jwtexample.model;

public class User {
	private String uId;
	private String name;
	private String email;

	public User() {
		super();
	}

	public User(String uId, String name, String email) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
