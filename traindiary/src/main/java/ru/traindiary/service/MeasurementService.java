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
	
	
	public List<Measurement> getAllWeightMeasurement(String username) {
		return 	measurementDao.getAllWeightMeasurement(username);
	}

	public void addWeightMeasurement(Measurement measurement) {
		measurementDao.addWeightMeasurement(measurement);
		
	}

	public void updateWeightMeasurement(Measurement measurement) {
		measurementDao.updateWeightMeasurement(measurement);
		
	}
	
	public List<Measurement> getAllNeckMeasurement(String username){
		return measurementDao.getAllNeckMeasurement(username);
	}	

	public void addNeckMeasurement(Measurement measurement){
		measurementDao.addNeckMeasurement(measurement);
	}
	
	public void updateNeckMeasurement(Measurement measurement){
		measurementDao.updateNeckMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllChestMeasurement(String username){
		return measurementDao.getAllChestMeasurement(username);
	}	
	
	public void addChestMeasurement(Measurement measurement){
		measurementDao.addChestMeasurement(measurement);
	}
	
	public void updateChestMeasurement(Measurement measurement){
		measurementDao.updateChestMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllWaistMeasurement(String username){
		return measurementDao.getAllWaistMeasurement(username);
	}	
	
	public void addWaistMeasurement(Measurement measurement){
		measurementDao.addWaistMeasurement(measurement);
	}
	
	public void updateWaistMeasurement(Measurement measurement){
		measurementDao.updateWaistMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllButtocksMeasurement(String username){
		return measurementDao.getAllButtocksMeasurement(username);
	}	
	
	public void addButtocksMeasurement(Measurement measurement){
		measurementDao.addButtocksMeasurement(measurement);
	}
	
	public void updateButtocksMeasurement(Measurement measurement){
		measurementDao.updateButtocksMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllHipMeasurement(String username){
		return measurementDao.getAllHipMeasurement(username);
	}	
	
	public void addHipMeasurement(Measurement measurement){
		measurementDao.addHipMeasurement(measurement);
	}
	
	public void updateHipMeasurement(Measurement measurement){
		measurementDao.updateHipMeasurement(measurement);
	}

	
	public List<Measurement> getAllCaviarMeasurement(String username){
		return measurementDao.getAllCaviarMeasurement(username);
	}	
	
	public void addCaviarMeasurement(Measurement measurement){
		measurementDao.addCaviarMeasurement(measurement);
	}
	
	public void updateCaviarMeasurement(Measurement measurement){
		measurementDao.updateCaviarMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllPelvisMeasurement(String username){
		return measurementDao.getAllPelvisMeasurement(username);
	}	
	
	public void addPelvisMeasurement(Measurement measurement){
		measurementDao.addPelvisMeasurement(measurement);
	}
	
	public void updatePelvisMeasurement(Measurement measurement){
		measurementDao.updatePelvisMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllBicepsMeasurement(String username){
		return measurementDao.getAllBicepsMeasurement(username);
	}	
	
	public void addBicepsMeasurement(Measurement measurement){
		measurementDao.addBicepsMeasurement(measurement);
	}
	
	public void updateBicepsMeasurement(Measurement measurement){
		measurementDao.updateBicepsMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllForearmMeasurement(String username){
		return measurementDao.getAllForearmMeasurement(username);
	}	
	
	public void addForearmMeasurement(Measurement measurement){
		measurementDao.addForearmMeasurement(measurement);
	}
	
	public void updateForearmMeasurement(Measurement measurement){
		measurementDao.updateForearmMeasurement(measurement);
	}
	
	
	public List<Measurement> getAllShouldersMeasurement(String username){
		return measurementDao.getAllShouldersMeasurement(username);
	}	
	
	public void addShouldersMeasurement(Measurement measurement){
		measurementDao.addShouldersMeasurement(measurement);
	}
	
	public void updateShouldersMeasurement(Measurement measurement){
		measurementDao.updateShouldersMeasurement(measurement);
	}
}