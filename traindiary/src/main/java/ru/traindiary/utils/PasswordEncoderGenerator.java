package ru.traindiary.utils;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

public class PasswordEncoderGenerator {

	private static final String SALT = "youwillnotpass";
	
	public String toSha(String pwd){
		ShaPasswordEncoder passwordEncoder = new ShaPasswordEncoder();
		return passwordEncoder.encodePassword(pwd, SALT);
	}
	
	public static void main(String [] args){
		PasswordEncoderGenerator encoderGenerator = new PasswordEncoderGenerator();
		System.out.println(encoderGenerator.toSha("12345678"));
	}
	
}
