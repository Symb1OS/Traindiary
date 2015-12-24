package ru.traindiary.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TrainingExercise {

	private BigInteger trainExerciseId;
	
	private BigInteger trainingId;
	
	private BigInteger exerciseId;
	
	private String comment;;
	
	private List<TrainSet> trainSet;
	
	public TrainingExercise(){
		trainSet = new ArrayList<TrainSet>();
	}

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public List<TrainSet> getTrainSet() {
		return trainSet;
	}

	public void setTrainSet(List<TrainSet> trainSet) {
		this.trainSet = trainSet;
	}

	@Override
	public String toString() {
		return "TrainingExercise [trainExerciseId=" + trainExerciseId + ", trainingId=" + trainingId + ", exerciseId="
				+ exerciseId + ", comment=" + comment + ", trainSet=" + trainSet + "]";
	}
	
}