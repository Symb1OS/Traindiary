package ru.traindiary.model;

public class UserRoles {
	
	private int userRoleId;
	
	private String username;
	
	private String role;

	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRoles [userRole=" + userRoleId + ", username=" + username
				+ ", role=" + role + "]";
	}
	
}
