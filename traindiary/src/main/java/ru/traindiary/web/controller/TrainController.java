package ru.traindiary.web.controller;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.TrainExercise;
import ru.traindiary.model.TrainSet;

@Controller
public class TrainController {
	
	 
	@RequestMapping(value = "/getExercise")
	public @ResponseBody Map<String, Object> trainExercise(){
		
		
		ArrayList<TrainExercise> data = new ArrayList<TrainExercise>();
		
		for (int i = 0; i < 10; i++) {
			TrainExercise exercise = new TrainExercise();
			exercise.setTrainExerciseId(new BigInteger(String.valueOf(i)));
			exercise.setTrainingId(new BigInteger(String.valueOf(i)));
			exercise.setExerciseId(new BigInteger(String.valueOf(i)));
			exercise.setExerciseName(String.valueOf(i));
			exercise.setComment(String.valueOf(i));
			
			for (int j = 0; j < 10; j++) {
				TrainSet set = new TrainSet();
				set.setSetId(new BigInteger(String.valueOf(j)));
				set.setTrainExerciseId(new BigInteger(String.valueOf(i)));
				set.setRepeat(15);
				set.setWeight(120);
				
				exercise.setTrainSet(set);
			}
			
			
			
			data.add(exercise);
		}
	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("TrainExerciseModel", data);
		
		return map;
		
		/*TrainSet set = new TrainSet();
		set.setSetId(new BigInteger("1"));
		set.setTrainExerciseId(new BigInteger("1"));
		set.setRepeat(15);
		set.setWeight(120);
		
		exercise.setTrainSet(set);*/
		/*
		try {
			return new ObjectMapper().writeValueAsString(exercise);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;*/
	
	}
	
	 
	@RequestMapping(value = "/getSet")
	public @ResponseBody String trainSet(){
		
		TrainSet set = new TrainSet();
		set.setSetId(new BigInteger("1"));
		set.setTrainExerciseId(new BigInteger("1"));
		set.setRepeat(15);
		set.setWeight(120);
		
		try {
			
			return new ObjectMapper().writeValueAsString(set);
		
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	
	}

}
