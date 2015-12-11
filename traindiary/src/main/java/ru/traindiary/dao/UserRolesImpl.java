package ru.traindiary.dao;

import java.util.List;

import ru.traindiary.model.UserRoles;

public interface UserRolesImpl {
	
	public List<UserRoles> getUserRolesList(String email);
	
	public void add(UserRoles userRoles);
	
	public void deleteAllRoles(String email);
	
	public void delete(int id);
	
}
