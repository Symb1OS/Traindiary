package ru.traindiary.model;

import java.util.ArrayList;
import java.util.List;

import ru.traindiary.utils.PasswordEncoderGenerator;


public class User {

	private String email;
	
	private String password;
	
	private int enabled;
	
	private List<UserRoles> userRoles;
	
	private Profile profile;

	public User(){
		userRoles = new ArrayList<UserRoles>();
	}
	
	public User(String email, String password){
		
		PasswordEncoderGenerator encoderGenerator = new PasswordEncoderGenerator();
		
		this.email = email;
		this.password = encoderGenerator.toSha(password);
		
		userRoles = new ArrayList<UserRoles>();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setShaPassword(String password) {
		PasswordEncoderGenerator encoderGenerator = new PasswordEncoderGenerator();
		this.password = encoderGenerator.toSha(password);
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}
	
	public void setUserRoles(UserRoles userRoles) {
		this.userRoles.add(userRoles);
	}
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", enabled="
				+ enabled + ", userRoles=" + userRoles + ", profile=" + profile
				+ "]";
	}

}