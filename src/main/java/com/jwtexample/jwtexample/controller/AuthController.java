package com.jwtexample.jwtexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtexample.jwtexample.reqresp.JwtRequest;
import com.jwtexample.jwtexample.reqresp.JwtResponse;
import com.jwtexample.jwtexample.security.JwtHelper;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserDetailsService userDetailsService;

//	@Autowired
//	private AuthenticationManager manager;

	@Autowired
	private JwtHelper helper;

	@PostMapping("/login")
	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {
		System.err.println("......auth/login..........");
		// this.doAuthenticate(request.getEmail(), request.getPassword());

		UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());

		String token = helper.generateToken(userDetails);

		JwtResponse response = JwtResponse.builder().jwtToken(token).username(userDetails.getUsername()).build();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

//	private void doAuthenticate(String email, String password) {
//		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
//		try {
//			System.err.println("......doAuthentication().........\n" + authentication);
//			Authentication temp = manager.authenticate(authentication);
//			System.err.println("==> " + temp);
//
//		} catch (BadCredentialsException e) {
//			throw new BadCredentialsException(" Invalid Username or Password  !!");
//		}
//	}
}
