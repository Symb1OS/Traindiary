package ru.traindiary.row_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		User user = new User();
		user.setEmail(rs.getString("USERNAME"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setEnabled(rs.getInt("ENABLED"));
		
		return user;
	}

}
