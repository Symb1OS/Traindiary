package ru.traindiary.model;

import java.math.BigInteger;

public class TrainSet {
	
	private BigInteger setId;
	private int repeat;
	private double weight;
	private BigInteger trainExerciseId;
	
	public BigInteger getSetId() {
		return setId;
	}
	
	public void setSetId(BigInteger setId) {
		this.setId = setId;
	}
	
	public int getRepeat() {
		return repeat;
	}
	
	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public BigInteger getTrainExerciseId() {
		return trainExerciseId;
	}
	
	public void setTrainExerciseId(BigInteger trainExerciseId) {
		this.trainExerciseId = trainExerciseId;
	}
	

}
