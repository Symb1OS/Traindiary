package ru.traindiary.dao;

import ru.traindiary.model.User;

public interface UserImpl {
	
	public User getUser(String email);
	
	public boolean isExist(String email);
	
	public void add(User user);
	
	public void delete(String email);
	
	public void lock(String email);
	
	public void changePassword(User user);
	
}
