package com.jwtexample.jwtexample.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwtexample.jwtexample.model.User;

@Service
public class UserService {
	private List<User> userList = new ArrayList<User>();

	public UserService() {
		userList.add(new User(UUID.randomUUID().toString(), "Amar", "amar@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Aniket", "aniket@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Nikhil", "nikhil@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Suresh", "suresh@gmail.com"));
	}

	public List<User> getUserList() {
		return this.userList;
	}
}
