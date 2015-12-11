package ru.traindiary.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Measurement;
import ru.traindiary.row_mapper.MeasurementMapper;

public class MeasurementDao implements MeasurementImpl{
	
	private static final int KEY_WEIGHT = 1;

	private static final String SELECT_ALL_BY_USER = "SELECT * FROM TRAINDIARY.MEASUREMENTS WHERE USERNAME = ? ORDER BY DATE";

	private static final String SELECT_ALL_WEIGHT = "SELECT * FROM TRAINDIARY.MEASUREMENT WHERE USERNAME = ?  AND BODYPARTID = ?  ORDER BY DATE";

	private static final String UPDATE_WEIGHT_MEASUREMENT = "UPDATE TRAINDIARY.MEASUREMENT SET  DATE = ?, VAL = ? WHERE ID = ?";

	private static final String INSERT_WEIGHT_MEASUREMENT = "INSERT INTO TRAINDIARY.MEASUREMENT (ID, BODYPARTID, USERNAME, DATE, VAL) VALUES (DEFAULT, ?, ?, ?, ?);";

	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<Measurement> getAllWeightMeasurement(String username) {
		return jdbc.query(SELECT_ALL_WEIGHT, new Object[]{username, KEY_WEIGHT}, new MeasurementMapper());
	}

	@Override
	public void addWeightMeasurement(Measurement measurement) {
		jdbc.update(INSERT_WEIGHT_MEASUREMENT, new Object[]{ KEY_WEIGHT,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateWeightMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_WEIGHT_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}
}