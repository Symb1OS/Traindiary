package ru.traindiary.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.traindiary.dao.TrainingDao;
import ru.traindiary.model.Exercise;
import ru.traindiary.model.Training;
import ru.traindiary.model.TrainingExercise;
import ru.traindiary.model.TrainingSet;

@Service
public class TrainingService {

	@Autowired
	private TrainingDao trainingDao;
	
	public TrainingDao getTrainingDao() {
		return trainingDao;
	}

	public void setTrainingDao(TrainingDao trainingDao) {
		this.trainingDao = trainingDao;
	}


	public List<Training>getTraining(String username, Date date){
		return trainingDao.getTraining(username, date);
	}
	
	public List<Training>getFullTraining(String username, Date date){
		
		/**
		 * Получаем Id всех тренировок  за месяц
		 * Получем в цикле объект тренировок
		 * Формируес поле  для экспандера
		 * 
		 * 
		 * */
		
		
		
		Training training = new Training();
		TrainingExercise trainingExercise = new TrainingExercise();
		TrainingSet trainingSet = new TrainingSet();
		
		
		return null;
	}
	
	public List<TrainingExercise> getTrainingExersice(String trainingId){
		return trainingDao.getTrainingExercise(trainingId);
	}
	
	public List<TrainingSet> getTrainingSet(String trainExerciseId){
		return trainingDao.getTrainingSet(trainExerciseId);
	}
	
	public List<Exercise> getExercise(){
		return trainingDao.getExercise();
	}
	
}