package ru.traindiary.row_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.UserRoles;

public class UserRolesMapper implements RowMapper<UserRoles>{

	@Override
	public UserRoles mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserRoles userRoles = new UserRoles();
		userRoles.setUserRoleId(rs.getInt("USER_ROLE_ID"));
		userRoles.setUsername(rs.getString("USERNAME"));
		userRoles.setRole(rs.getString("ROLE"));
		
		return userRoles;
	}

}
