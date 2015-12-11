package ru.traindiary.model;

import java.math.BigInteger;
import java.util.Date;

public class Profile {

	private BigInteger customerId;
	private String username;
	private String lastName;
	private String firstName;
	private String secondName;
	private int sex;
	private Date birthday;
	private String city;
	
	public Profile(){
		
	}
	
	public Profile(String username, String lastName, String firstName, String secondName, int sex, Date birthday, String city){
		this.username = username;
		this.lastName = lastName;
		this.firstName = firstName;
		this.secondName = secondName;
		this.sex = sex;
		this.birthday = birthday;
		this.city = city;
	}

	public BigInteger getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Profile [customerId=" + customerId + ", username=" + username
				+ ", lastName=" + lastName + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", sex=" + sex + ", birthday="
				+ birthday + ", city=" + city + "]";
	}
	
}