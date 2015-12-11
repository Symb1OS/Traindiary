package ru.traindiary.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.User;
import ru.traindiary.row_mapper.UserRowMapper;

public class UserDao  implements UserImpl {

	@Autowired
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	private static final String SELECT_USER = "SELECT * FROM  TRAINDIARY.USERS WHERE USERNAME  = ?";
	
	private static final String CHECK_USER_EXIST = "SELECT COUNT(*) AS COUNT FROM  TRAINDIARY.USERS WHERE USERNAME  = ? ";
	
	private static final String INSERT_USER = "INSERT INTO TRAINDIARY.USERS (USERNAME, PASSWORD, ENABLED) VALUES (?, ?, 1);";
	
	private static final String DELETE_USER = "DELETE FROM TRAINDIARY.USERS WHERE USERNAME = ?";
	
	private static final String LOCK_USER = "UPDATE TRAINDIARY.USERS SET ENABLED = 0 WHERE USERNAME = ?";

	private static final String UPDATE_PASSWORD = "UPDATE TRAINDIARY.USERS SET PASSWORD = ? WHERE USERNAME = ?";
	
	@Override
	public User getUser(String email) {
		return jdbc.queryForObject(SELECT_USER, new Object[]{email}, new UserRowMapper());
	}

	@Override
	public boolean isExist(String email) {
		return  (Integer) jdbc.queryForMap(CHECK_USER_EXIST, new Object[]{email}).get("COUNT") != 1 ? false : true; 
	}

	@Override
	public void add(User user) {
		jdbc.update(INSERT_USER, new Object[]{user.getEmail(), 
											  user.getPassword()});
	}

	@Override
	public void delete(String email) {
		jdbc.update(DELETE_USER, new Object[]{email});
		
	}

	@Override
	public void lock(String email) {
		jdbc.update(LOCK_USER, new Object[]{email});
		
	}

	@Override
	public void changePassword(User user) {
		jdbc.update(UPDATE_PASSWORD, new Object[]{user.getPassword(), user.getEmail()});
		
	}
	
}