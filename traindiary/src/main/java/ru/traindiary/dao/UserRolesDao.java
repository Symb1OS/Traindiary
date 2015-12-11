package ru.traindiary.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.UserRoles;
import ru.traindiary.row_mapper.UserRolesMapper;

public class UserRolesDao implements UserRolesImpl {
	
	private static final String SELECT_USER_ROLE = "SELECT * FROM TRAINDIARY.USER_ROLES WHERE USERNAME = ?";
	
	private static final String INSERT_USER_ROLE = "INSERT INTO TRAINDIARY.USER_ROLES (user_role_id, username, role) VALUES (default, ?, ?)";
	
	private static final String DELETE_USER_ROLE = "DELETE FROM TRAINDIARY.USER_ROLES WHERE user_role_id = ?;";
	
	private static final String DELETE_ALL_USER_ROLE = "DELETE FROM TRAINDIARY.USER_ROLES WHERE username = ?;";
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<UserRoles> getUserRolesList(String email) {
		return jdbc.query(SELECT_USER_ROLE, new Object[]{email}, new UserRolesMapper());
	}

	@Override
	public void delete(int id) {
		jdbc.update(DELETE_USER_ROLE, new Object[]{id});
	}
	
	@Override
	public void deleteAllRoles(String email) {
		jdbc.update(DELETE_ALL_USER_ROLE, new Object[]{email});
		
	}

	@Override
	public void add(UserRoles userRoles) {
		jdbc.update(INSERT_USER_ROLE, new Object[]{userRoles.getUsername(), 
												   userRoles.getRole()});
		
	}

}