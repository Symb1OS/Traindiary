package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.TrainingExercise;

public class TrainingExerciseMapper implements RowMapper<TrainingExercise> {

	@Override
	public TrainingExercise mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		TrainingExercise trainingExercise = new TrainingExercise();
		trainingExercise.setTrainExerciseId(new BigInteger(rs.getString("TRAINEXERCISEID")));
		trainingExercise.setTrainingId(new BigInteger(rs.getString("TRAININGID")));
		trainingExercise.setExerciseId(new BigInteger(rs.getString("EXERCISEID")));
		trainingExercise.setComment(rs.getString("COMMENT"));
		
		return trainingExercise;
	}

}