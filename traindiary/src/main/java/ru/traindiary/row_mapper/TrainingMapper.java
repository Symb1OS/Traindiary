package ru.traindiary.row_mapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ru.traindiary.model.Training;

public class TrainingMapper implements RowMapper<Training> {

	@Override
	public Training mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Training  training = new Training();
		training.setTrainingId(new BigInteger(rs.getString("TRAININGID")));
		training.setUsername(rs.getString("USERNAME"));
		training.setDate(rs.getDate("DATE"));
		training.setDescription(rs.getString("DESCRIPTION"));
		
		return training;
	}

}