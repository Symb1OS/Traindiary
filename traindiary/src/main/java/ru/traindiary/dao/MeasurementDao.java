package ru.traindiary.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Measurement;
import ru.traindiary.row_mapper.MeasurementMapper;

public class MeasurementDao implements MeasurementImpl{

	private static final String SELECT_ALL_BY_USER = "SELECT * FROM TRAINDIARY.MEASUREMENTS WHERE USERNAME = ? ORDER BY DATE";

	private static final String UPDATE_MEASUREMENT = "UPDATE TRAINDIARY.MEASUREMENTS SET  DATE = ?, WEIGHT = ?, NECK = ?, CHEST = ?, WAIST = ?, BUTTOCKS = ?, HIP = ?, CAVIAR = ?, PELVIS = ?, BICEPS = ?, FOREARM = ?, SHOULDERS = ? WHERE MEASUREMENTID = ?";

	private static final String INSERT_MEASUREMENT = "INSERT INTO TRAINDIARY.MEASUREMENTS (MEASUREMENTID, USERNAME, DATE, WEIGHT, NECK, CHEST, WAIST, BUTTOCKS, HIP, CAVIAR, PELVIS, BICEPS, FOREARM, SHOULDERS) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Measurement getMeasurement(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Measurement> getAllMeasurement(String username) {
		return  jdbc.query(SELECT_ALL_BY_USER, new Object[]{username}, new MeasurementMapper());
	}

	@Override
	public void updateMeasurement(Measurement measurement) {
		jdbc.update(UPDATE_MEASUREMENT, new Object[]{
													measurement.getDate(),
													measurement.getWeight(),
													measurement.getNeck(),
													measurement.getChest(),
													measurement.getWaist(),
													measurement.getButtocks(),
													measurement.getHip(),
													measurement.getCavair(),
													measurement.getPelvis(),
													measurement.getBiceps(),
													measurement.getForearm(),
													measurement.getShoulders(),
													measurement.getMeasurementId()
		});
		
	}

	@Override
	public void addMeasurement(Measurement measurement) {
		jdbc.update(INSERT_MEASUREMENT, new Object[]{
													measurement.getUsername(),
													measurement.getDate(),
													measurement.getWeight(),
													measurement.getNeck(),
													measurement.getChest(),
													measurement.getWaist(),
													measurement.getButtocks(),
													measurement.getHip(),
													measurement.getCavair(),
													measurement.getPelvis(),
													measurement.getBiceps(),
													measurement.getForearm(),
													measurement.getShoulders()
		});
		
	}
	
}