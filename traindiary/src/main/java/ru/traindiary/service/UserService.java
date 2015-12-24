package ru.traindiary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.traindiary.dao.MeasurementDao;
import ru.traindiary.dao.ProfileDao;
import ru.traindiary.dao.UserDao;
import ru.traindiary.dao.UserRolesDao;
import ru.traindiary.model.Profile;
import ru.traindiary.model.User;
import ru.traindiary.model.UserRoles;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRolesDao userRolesDao;
	
	@Autowired
	private ProfileDao profileDao;
	
	@Autowired
	private MeasurementDao measurementDao;
	
	public MeasurementDao getMeasurementDao() {
		return measurementDao;
	}

	public void setMeasurementDao(MeasurementDao measurementDao) {
		this.measurementDao = measurementDao;
	}

	public ProfileDao getProfileDao() {
		return profileDao;
	}

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserRolesDao getUserRolesDao() {
		return userRolesDao;
	}

	public void setUserRolesDao(UserRolesDao userRolesDao) {
		this.userRolesDao = userRolesDao;
	}

	public User getUser(String email){
		User user = userDao.getUser(email);
		List<UserRoles> userRoles = userRolesDao.getUserRolesList(email);
		user.setUserRoles(userRoles);
		Profile profile = profileDao.getProfile(email);
		user.setProfile(profile);
		
		return user;
	}
	
	public void addUser(User user){
		userDao.add(user);
		List<UserRoles> userRoles = user.getUserRoles();
		for (UserRoles role : userRoles) {
			userRolesDao.add(role);
		}
		profileDao.addProfile(user.getProfile());
	
	}
	
	public void deleteUser(String email){
		userRolesDao.deleteAllRoles(email);
		userDao.delete(email);
	}
	
	public void updateProfile(Profile profile){
		profileDao.updateProfile(profile);
	}
	
	public void lockUser(String email){
		userDao.lock(email);
	}
	
	public boolean userIsExist(String email){
		return userDao.isExist(email);
	}
	
	public void changePassword(User user){
		userDao.changePassword(user);
	}

}