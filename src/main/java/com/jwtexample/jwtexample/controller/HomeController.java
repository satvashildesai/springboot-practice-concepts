package com.jwtexample.jwtexample.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtexample.jwtexample.model.User;
import com.jwtexample.jwtexample.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {
		return this.userService.getUserList();
	}

	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
