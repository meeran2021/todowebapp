package com.meeran.springboot.todowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUsername= username.equalsIgnoreCase("meeran2001");
		boolean isValidPassword= password.equalsIgnoreCase("1234");
		
		return isValidUsername && isValidPassword;
	}
}
