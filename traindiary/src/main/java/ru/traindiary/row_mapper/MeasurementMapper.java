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
		measurement.setMeasurementId(new BigInteger(rs.getString("MEASUREMENTID")));
		measurement.setUsername(rs.getString("USERNAME"));
		measurement.setDate(rs.getDate("DATE"));
		measurement.setWeight(rs.getDouble("WEIGHT"));
		measurement.setNeck(rs.getDouble("NECK"));
		measurement.setChest(rs.getDouble("CHEST"));
		measurement.setWaist(rs.getDouble("WAIST"));
		measurement.setButtocks(rs.getDouble("BUTTOCKS"));
		measurement.setHip(rs.getDouble("HIP"));
		measurement.setCavair(rs.getDouble("CAVIAR"));
		measurement.setPelvis(rs.getDouble("PELVIS"));
		measurement.setBiceps(rs.getDouble("BICEPS"));
		measurement.setForearm(rs.getDouble("FOREARM"));
		measurement.setShoulders(rs.getDouble("SHOULDERS"));
		
		return measurement;
	}
	
}