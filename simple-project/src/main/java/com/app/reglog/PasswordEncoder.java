package com.app.reglog;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String [] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawPwd="ravi123";
		String encodedPwd=encoder.encode(rawPwd);
		
		System.out.println(encodedPwd);
	}
}
