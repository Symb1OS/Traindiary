package ru.traindiary.model;

import java.math.BigInteger;

public class Exercise {
	
	private BigInteger exerciseId;
	
	private String name;
	
	private BigInteger muscleGroupId;

	public BigInteger getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(BigInteger exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getMuscleGroupId() {
		return muscleGroupId;
	}

	public void setMuscleGroupId(BigInteger muscleGroupId) {
		this.muscleGroupId = muscleGroupId;
	}

	@Override
	public String toString() {
		return "Exercise [exerciseId=" + exerciseId + ", name=" + name + ", muscleGroupId=" + muscleGroupId + "]";
	}

}