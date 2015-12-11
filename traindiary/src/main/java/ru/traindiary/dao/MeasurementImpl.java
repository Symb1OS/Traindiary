package ru.traindiary.dao;

import java.math.BigInteger;
import java.util.List;

import ru.traindiary.model.Measurement;

public interface MeasurementImpl {
	
	public Measurement getMeasurement(BigInteger id);
	
	public List<Measurement> getAllMeasurement(String username);
	
	public void updateMeasurement(Measurement measurement);
	
	public void addMeasurement(Measurement measurement);
	
}
