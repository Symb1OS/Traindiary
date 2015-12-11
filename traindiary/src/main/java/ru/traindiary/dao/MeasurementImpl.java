package ru.traindiary.dao;

import java.util.List;

import ru.traindiary.model.Measurement;

public interface MeasurementImpl {
	
	public List<Measurement> getAllWeightMeasurement(String username);
	
	public void addWeightMeasurement(Measurement measurement);
	
	public void updateWeightMeasurement(Measurement measurement);
	

	
}
