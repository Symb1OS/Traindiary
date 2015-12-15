package ru.traindiary.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Measurement;
import ru.traindiary.row_mapper.MeasurementMapper;

public class MeasurementDao implements MeasurementImpl{
	
	private static final int KEY_WEIGHT = 1;
	private static final int KEY_NECK = 2;
	private static final int KEY_CHEST = 3;
	private static final int KEY_WAIST = 4;
	private static final int KEY_BUTTOCKS = 5;
	private static final int KEY_HIP = 6;
	private static final int KEY_CAVIAR = 7;
	private static final int KEY_PELVIS = 8;
	private static final int KEY_BICEPS = 9;
	private static final int KEY_FOREARM = 10;
	private static final int KEY_SHOULDERS = 11;

	private static final String SELECT_ALL_W_KEY = "SELECT * FROM TRAINDIARY.MEASUREMENT WHERE USERNAME = ?  AND BODYPARTID = ?  ORDER BY DATE";
	private static final String UPDATE_MEASUREMENT = "UPDATE TRAINDIARY.MEASUREMENT SET  DATE = ?, VAL = ? WHERE ID = ?";
	private static final String INSERT_MEASUREMENT_W_KEY = "INSERT INTO TRAINDIARY.MEASUREMENT (ID, BODYPARTID, USERNAME, DATE, VAL) VALUES (DEFAULT, ?, ?, ?, ?);";

	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<Measurement> getAllWeightMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_WEIGHT}, new MeasurementMapper());
	}

	@Override
	public void addWeightMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_WEIGHT,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateWeightMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllNeckMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_NECK}, new MeasurementMapper());
	}

	@Override
	public void addNeckMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_NECK,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateNeckMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllChestMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_CHEST}, new MeasurementMapper());
	}

	@Override
	public void addChestMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_CHEST,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateChestMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllWaistMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_WAIST}, new MeasurementMapper());
	}

	@Override
	public void addWaistMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_WAIST,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateWaistMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
				measurement.getVal(),
				measurement.getId()});
	}

	@Override
	public List<Measurement> getAllButtocksMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_BUTTOCKS}, new MeasurementMapper());
	}

	@Override
	public void addButtocksMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_BUTTOCKS,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateButtocksMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllHipMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_HIP}, new MeasurementMapper());
	}

	@Override
	public void addHipMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_HIP,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateHipMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllCaviarMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_CAVIAR}, new MeasurementMapper());
	}

	@Override
	public void addCaviarMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_CAVIAR,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateCaviarMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllPelvisMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_PELVIS}, new MeasurementMapper());
	}

	@Override
	public void addPelvisMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_PELVIS,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updatePelvisMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllBicepsMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_BICEPS}, new MeasurementMapper());
	}

	@Override
	public void addBicepsMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_BICEPS,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateBicepsMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllForearmMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_FOREARM}, new MeasurementMapper());
	}

	@Override
	public void addForearmMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_FOREARM,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateForearmMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}

	@Override
	public List<Measurement> getAllShouldersMeasurement(String username) {
		return jdbc.query(SELECT_ALL_W_KEY, new Object[]{username, KEY_SHOULDERS}, new MeasurementMapper());
	}

	@Override
	public void addShouldersMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT_W_KEY, new Object[]{ KEY_SHOULDERS,
															measurement.getUsername(),			
															measurement.getDate(),
															measurement.getVal()});
	}

	@Override
	public void updateShouldersMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{measurement.getDate(),
															measurement.getVal(),
															measurement.getId()});
	}
}