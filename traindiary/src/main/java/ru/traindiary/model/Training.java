package ru.traindiary.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Training {

	private BigInteger trainingId;
	
	private String username;
	
	private Date date;
	
	private String description;
	
	private List<TrainingExercise> trainExercise;
	
	
	public Training(){
		trainExercise = new ArrayList<TrainingExercise>();
	}

	public BigInteger getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(BigInteger trainingId) {
		this.trainingId = trainingId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<TrainingExercise> getTrainExercise() {
		return trainExercise;
	}

	public void setTrainExercise(List<TrainingExercise> trainExercise) {
		this.trainExercise = trainExercise;
	}

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", username=" + username + ", date=" + date + ", description="
				+ description + ", trainExercise=" + trainExercise + "]";
	}
	
}