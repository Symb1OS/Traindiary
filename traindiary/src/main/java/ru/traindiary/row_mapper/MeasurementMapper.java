package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.Measurement;

public class MeasurementMapper implements RowMapper<Measurement> {

	@Override
	public Measurement mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Measurement measurement = new Measurement();
		measurement.setId(new BigInteger(rs.getString("ID")));
		measurement.setBodyPartId(new BigInteger(rs.getString("BODYPARTID")));
		measurement.setUsername(rs.getString("USERNAME"));
		measurement.setDate(rs.getDate("DATE"));
		measurement.setVal(rs.getDouble("VAL"));
		
		return measurement;
	}
	
}