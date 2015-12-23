package ru.traindiary.model;

import java.math.BigInteger;

public class TrainExercise {
	
	private BigInteger trainExerciseId;
	private BigInteger trainingId;
	private BigInteger exerciseId;
	private String exerciseName;
	private TrainSet trainSet;
	private String comment;
	
	public BigInteger getTrainExerciseId() {
		return trainExerciseId;
	}
	
	public void setTrainExerciseId(BigInteger trainExerciseId) {
		this.trainExerciseId = trainExerciseId;
	}
	
	public BigInteger getTrainingId() {
		return trainingId;
	}
	
	public void setTrainingId(BigInteger trainingId) {
		this.trainingId = trainingId;
	}
	
	public BigInteger getExerciseId() {
		return exerciseId;
	}
	
	public void setExerciseId(BigInteger exerciseId) {
		this.exerciseId = exerciseId;
	}
	
	public String getExerciseName() {
		return exerciseName;
	}
	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}
	public TrainSet getTrainSet() {
		return trainSet;
	}
	
	public void setTrainSet(TrainSet trainSet) {
		this.trainSet = trainSet;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}