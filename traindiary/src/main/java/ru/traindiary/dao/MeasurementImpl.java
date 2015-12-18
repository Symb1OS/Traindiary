package ru.traindiary.dao;

import ru.traindiary.model.Measurement;

public interface MeasurementImpl {
	
	public void addMeasurement(Measurement measurement);
	
	public void updateMeasurement(Measurement measurement);
	
	public void deleteMeasurement(Measurement measurement);
	
}