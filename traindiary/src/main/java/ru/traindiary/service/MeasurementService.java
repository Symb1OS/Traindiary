package ru.traindiary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.traindiary.dao.MeasurementDao;
import ru.traindiary.model.Measurement;

@Service
public class MeasurementService {

	@Autowired
	private MeasurementDao measurementDao;

	public MeasurementDao getMeasurementDao() {
		return measurementDao;
	}

	public void setMeasurementDao(MeasurementDao measurementDao) {
		this.measurementDao = measurementDao;
	}
	
	
	
	public void addMeasurement(Measurement measurement) {
		measurementDao.addMeasurement(measurement);
		
	}
	
	public void updateMeasurement(Measurement measurement){
		measurementDao.updateMeasurement(measurement);
	}
	
	public void deleteMeasurement(Measurement measurement) {
		measurementDao.deleteMeasurement(measurement);
	}
	
	public List<Measurement> getAllMeasurement(String username, String bodyPartId) {
		return 	measurementDao.getAllMeasurement(username, bodyPartId);
	}

}