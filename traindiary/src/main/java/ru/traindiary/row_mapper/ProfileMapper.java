package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.Profile;

public class ProfileMapper implements RowMapper<Profile> {

	@Override
	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profile profile = new Profile();
		profile.setCustomerId(new BigInteger(rs.getString("CUSTOMERID")));
		profile.setUsername(rs.getString("USERNAME"));
		profile.setLastName(rs.getString("NAME"));
		profile.setFirstName(rs.getString("NAME1"));
		profile.setSecondName(rs.getString("NAME2"));
		profile.setSex(rs.getInt("SEX"));
		profile.setBirthday(rs.getDate("DATE_BIRTHDAY"));
		profile.setCity(rs.getString("CITY"));
		
		return profile;
	}

}
