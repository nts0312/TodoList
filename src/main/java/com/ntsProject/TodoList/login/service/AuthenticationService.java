package com.ntsProject.TodoList.login.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticationUser(String username, String pwd) {

		boolean isValidusername = username.equalsIgnoreCase("abc");

		boolean isValiduserpwd = pwd.equalsIgnoreCase("abc");

		return isValidusername && isValiduserpwd;

	}

}
