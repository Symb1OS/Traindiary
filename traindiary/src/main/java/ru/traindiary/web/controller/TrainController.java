package ru.traindiary.web.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Exercise;
import ru.traindiary.model.Training;
import ru.traindiary.model.TrainingExercise;
import ru.traindiary.model.TrainingSet;
import ru.traindiary.service.TrainingService;

@Controller
public class TrainController {
	
	@Autowired
	private TrainingService trainingService;

	private static final Logger logger = Logger.getLogger(TrainController.class);
	
	@RequestMapping(value = "user/training/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readTraining(
			@RequestParam(value = "date") Date date){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List<Training> training = trainingService.getTraining(auth.getName(), date);
		
		logger.info(training);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("training", training);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/trainexercise/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readTrainExercise(
			@RequestParam(value = "trainigId") String trainingId){
		
		List<TrainingExercise> training = trainingService.getTrainingExersice(trainingId);
		
		logger.info(training);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("trainexercise", training);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/trainset/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readTrainSet(
			@RequestParam(value = "trainExerciseId") String trainExerciseId){
		
		List<TrainingSet> training = trainingService.getTrainingSet(trainExerciseId);
		
		logger.info(training);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("trainset", training);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/exercise/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readExercise(){
		
		List<Exercise> exercise = trainingService.getExercise();
		
		logger.info(exercise);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("exercise", exercise);
		
		return map;
		
	}
	 
}