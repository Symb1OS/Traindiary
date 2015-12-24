package ru.traindiary.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ru.traindiary.model.Exercise;
import ru.traindiary.model.Training;
import ru.traindiary.model.TrainingExercise;
import ru.traindiary.model.TrainingSet;
import ru.traindiary.row_mapper.ExerciseMapper;
import ru.traindiary.row_mapper.TrainingExerciseMapper;
import ru.traindiary.row_mapper.TrainingMapper;
import ru.traindiary.row_mapper.TrainingSetMapper;

public class TrainingDao implements TrainingImpl {

	@Autowired
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	private static final String SELECT_ALL_TRAINING = "SELECT * FROM TRAINDIARY.TRAINING  WHERE USERNAME = ? AND month(date) = ? and year(date) = ?";
	private static final String SELECT_ALL_EXERCISE = "SELECT * FROM TRAINDIARY.TRAINING_EXERCISE TE  LEFT JOIN TRAINDIARY.EXERCISE E ON E.EXERCISEID = TE.EXERCISEID WHERE TE.TRAININGID = ?";
	private static final String SELECT_ALL_SET = "SELECT * FROM TRAINDIARY.TRAINING_SET WHERE TRAINEXERCISEID = ?";
	private static final String SELECT_EXERCISE = "SELECT * FROM TRAINDIARY.EXERCISE";
	
	
	@Override
	public List<Training> getTraining(String username, Date date) {
		return jdbc.query(SELECT_ALL_TRAINING, new Object[]{username, date.getMonth() + 1, date.getYear() + 1900}, new TrainingMapper());
	}

	@Override
	public List<TrainingExercise> getTrainingExercise(String trainingId) {
		return jdbc.query(SELECT_ALL_EXERCISE, new Object[]{trainingId}, new TrainingExerciseMapper());
	}

	@Override
	public List<TrainingSet> getTrainingSet(String trainExerciseId) {
		return jdbc.query(SELECT_ALL_SET, new Object[]{trainExerciseId}, new TrainingSetMapper());
	}

	@Override
	public List<Exercise> getExercise() {
		return jdbc.query(SELECT_EXERCISE, new ExerciseMapper());
	}

}