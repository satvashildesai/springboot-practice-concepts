package com.jwtexample.jwtexample;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtexampleApplication {

	public static void main(String[] args) {
		String encodedToken = "YXJqdW46YXJqdW5AMTIz";

		// Decode the Base64-encoded string
		byte[] decodedBytes = Base64.getDecoder().decode(encodedToken);
		String decodedToken = new String(decodedBytes, StandardCharsets.UTF_8);
		System.out.println("Decoded Token: " + decodedToken);

		SpringApplication.run(JwtexampleApplication.class, args);

	}

}
