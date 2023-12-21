package com.ntsGroup.springboot.firstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String pwd) {
	
	boolean isValidUserName = username.equalsIgnoreCase("Nitin");
	boolean isValidPassword = 	pwd.equalsIgnoreCase("123");
	
	if (isValidUserName && isValidPassword) {
		return true;
	}
	return false;
	}
	
}
