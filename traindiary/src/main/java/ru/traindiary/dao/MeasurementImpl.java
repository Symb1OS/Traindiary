package ru.traindiary.dao;

import java.util.List;

import ru.traindiary.model.Measurement;

public interface MeasurementImpl {
	
	public List<Measurement> getAllWeightMeasurement(String username);
	
	public void addWeightMeasurement(Measurement measurement);
	
	public void updateWeightMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllNeckMeasurement(String username);
	
	public void addNeckMeasurement(Measurement measurement);
	
	public void updateNeckMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllChestMeasurement(String username);
	
	public void addChestMeasurement(Measurement measurement);
	
	public void updateChestMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllWaistMeasurement(String username);
	
	public void addWaistMeasurement(Measurement measurement);
	
	public void updateWaistMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllButtocksMeasurement(String username);
	
	public void addButtocksMeasurement(Measurement measurement);
	
	public void updateButtocksMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllHipMeasurement(String username);
	
	public void addHipMeasurement(Measurement measurement);
	
	public void updateHipMeasurement(Measurement measurement);

	
	public List<Measurement> getAllCaviarMeasurement(String username);
	
	public void addCaviarMeasurement(Measurement measurement);
	
	public void updateCaviarMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllPelvisMeasurement(String username);
	
	public void addPelvisMeasurement(Measurement measurement);
	
	public void updatePelvisMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllBicepsMeasurement(String username);
	
	public void addBicepsMeasurement(Measurement measurement);
	
	public void updateBicepsMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllForearmMeasurement(String username);
	
	public void addForearmMeasurement(Measurement measurement);
	
	public void updateForearmMeasurement(Measurement measurement);
	
	
	public List<Measurement> getAllShouldersMeasurement(String username);
	
	public void addShouldersMeasurement(Measurement measurement);
	
	public void updateShouldersMeasurement(Measurement measurement);
	
}