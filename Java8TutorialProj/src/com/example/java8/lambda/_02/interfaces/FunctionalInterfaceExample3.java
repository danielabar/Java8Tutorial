package com.example.java8.lambda._02.interfaces;

import java.security.MessageDigest;

public class FunctionalInterfaceExample3 {
	
	public static void main(String[] args) throws Exception {
		PasswordEncoder4 md5Encoder = (password, salt) -> {
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			String saltedPassword = password + salt;
			byte[] digest = md.digest(saltedPassword.getBytes());
			return new String(digest);
		};
		
		String salted = md5Encoder.encode("abc", "123");
		System.out.println(salted);
	}

}
