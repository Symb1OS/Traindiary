package ru.traindiary.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Profile;
import ru.traindiary.row_mapper.ProfileMapper;

public class ProfileDao implements ProfileImpl{

	private static final String SELECT_PROFILE = "SELECT * FROM TRAINDIARY.PROFILE WHERE USERNAME = ?";
	
	private static final String INSERT_PROFILE = "INSERT INTO TRAINDIARY.PROFILE (CUSTOMERID, USERNAME, NAME, NAME1, NAME2, SEX, DATE_BIRTHDAY, CITY) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
	
	private static final String UPDATE_PROFILE = "UPDATE TRAINDIARY.PROFILE SET   NAME = ?, NAME1 = ?, NAME2 = ?, SEX = ?, DATE_BIRTHDAY = ?, CITY = ? WHERE CUSTOMERID = ?";
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void addProfile(Profile profile) {
		jdbc.update(INSERT_PROFILE, new Object[]{profile.getUsername(),
												profile.getLastName(),
												profile.getFirstName(),
												profile.getSecondName(),
												profile.getSex(),
												profile.getBirthday(),
												profile.getCity()});
		
	}

	@Override
	public void updateProfile(Profile profile) {
		jdbc.update(UPDATE_PROFILE, new Object[]{profile.getLastName(),
												profile.getFirstName(),
												profile.getSecondName(),
												profile.getSex(),
												profile.getBirthday(),
												profile.getCity(),
												profile.getCustomerId()});
		
	}

	@Override
	public Profile getProfile(String email) {
		return jdbc.queryForObject(SELECT_PROFILE, new Object[]{email}, new ProfileMapper());
	}
}