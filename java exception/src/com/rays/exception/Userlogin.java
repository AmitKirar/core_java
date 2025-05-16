package com.rays.exception;

import javax.security.auth.login.LoginException;

public class Userlogin {
	public static void main(String[] args) throws LoginException {
		String login = "admin";
		String pwd = "adminj";
		if (login == "admin" && pwd == "admin") {
			System.out.println("login successfully");
		} else {
			throw new LoginException("login or pwd is invalid");
		}

	}

}
