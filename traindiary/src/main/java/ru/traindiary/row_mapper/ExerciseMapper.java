package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.Exercise;

public class ExerciseMapper implements RowMapper<Exercise> {

	@Override
	public Exercise mapRow(ResultSet rs, int rowNum) throws SQLException {
		Exercise exercise = new Exercise();
		exercise.setExerciseId(new BigInteger(rs.getString("EXERCISEID")));
		exercise.setName(rs.getString("NAME"));
		exercise.setMuscleGroupId(new BigInteger(rs.getString("MUSCLE_GROUP_ID")));
		return exercise;
	}

}
