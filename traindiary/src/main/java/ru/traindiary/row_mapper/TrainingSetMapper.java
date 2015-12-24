package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.TrainingSet;

public class TrainingSetMapper implements RowMapper<TrainingSet> {

	@Override
	public TrainingSet mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		TrainingSet trainingSet = new TrainingSet();
		trainingSet.setSetId(new BigInteger(rs.getString("SETID")));
		trainingSet.setTrainExerciseId(new BigInteger(rs.getString("TRAINEXERCISEID")));
		trainingSet.setRepeat(rs.getInt("REPEAT"));
		trainingSet.setWeight(rs.getDouble("WEIGHT"));
		
		return trainingSet;
	}

}
