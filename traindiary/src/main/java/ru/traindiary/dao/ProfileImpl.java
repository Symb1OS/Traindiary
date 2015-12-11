package ru.traindiary.dao;

import ru.traindiary.model.Profile;

public interface ProfileImpl {
	
	public void addProfile(Profile profile);
	
	public void updateProfile(Profile profile);
	
	public Profile getProfile(String email);
	
}
