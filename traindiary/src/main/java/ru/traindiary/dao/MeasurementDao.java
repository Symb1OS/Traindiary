package ru.traindiary.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Measurement;
import ru.traindiary.row_mapper.MeasurementMapper;

public class MeasurementDao implements MeasurementImpl{
	
	private static final String SELECT_ALL_W_KEY = "SELECT * FROM TRAINDIARY.MEASUREMENT WHERE USERNAME = ?  AND BODYPARTID = ?  ORDER BY DATE";
	private static final String UPDATE_MEASUREMENT = "UPDATE TRAINDIARY.MEASUREMENT SET  DATE = ?, VAL = ? WHERE ID = ?";
	private static final String DELETE_MEASUREMENT = "DELETE FROM TRAINDIARY.MEASUREMENT WHERE ID = ?";
	private static final String INSERT_MEASUREMENT = "INSERT INTO TRAINDIARY.MEASUREMENT (ID, BODYPARTID, USERNAME, DATE, VAL) VALUES (DEFAULT, ?, ?, ?, ?);";
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	@Override
	public void updateMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
		
	}

	public void addMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT, new Object[]{ measurement.getBodyPartId(),
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}
	
	@Override
	public void deleteMeasurement(Measurement measurement) {
		jdbc.update(DELETE_MEASUREMENT, new Object[]{measurement.getId()});
		
	}
	
	public List<Measurement> getAllMeasurement(String username, String bodyPartId) {
	 	return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, bodyPartId}, new MeasurementMapper());
	}
}