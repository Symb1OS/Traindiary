package ru.traindiary.model;

import java.math.BigInteger;

public class TrainingSet {

	private BigInteger setId;
	
	private BigInteger trainExerciseId;
	
	private Integer repeat;
	
	private Double weight;

	public BigInteger getSetId() {
		return setId;
	}

	public void setSetId(BigInteger setId) {
		this.setId = setId;
	}

	public BigInteger getTrainExerciseId() {
		return trainExerciseId;
	}

	public void setTrainExerciseId(BigInteger trainExerciseId) {
		this.trainExerciseId = trainExerciseId;
	}

	public Integer getRepeat() {
		return repeat;
	}

	public void setRepeat(Integer repeat) {
		this.repeat = repeat;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "TrainingSet [setId=" + setId + ", trainExerciseId=" + trainExerciseId + ", repeat=" + repeat
				+ ", weight=" + weight + "]";
	}
	
}