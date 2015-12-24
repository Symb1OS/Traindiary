package ru.traindiary.dao;

import java.sql.Date;
import java.util.List;

import ru.traindiary.model.Exercise;
import ru.traindiary.model.Training;
import ru.traindiary.model.TrainingExercise;
import ru.traindiary.model.TrainingSet;

public interface TrainingImpl {

	public List<Training> getTraining(String username, Date date);
	
	public List<TrainingExercise> getTrainingExercise(String trainingId);
	
	public List<TrainingSet> getTrainingSet(String trainExerciseId);
	
	public List<Exercise> getExercise();
	
}
