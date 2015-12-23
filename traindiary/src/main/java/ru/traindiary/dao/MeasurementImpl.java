package ru.traindiary.dao;

import java.util.List;

import ru.traindiary.model.Measurement;

public interface MeasurementImpl {
	
	public void addMeasurement(Measurement measurement);
	
	public void updateMeasurement(Measurement measurement);
	
	public void deleteMeasurement(Measurement measurement);

	public List<Measurement> getAllMeasurement(String username, String bodyPartId);
}