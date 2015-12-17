package ru.traindiary.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Measurement;
import ru.traindiary.service.MeasurementService;

@Controller
public class StatisticController {

	@Autowired
	private MeasurementService measurementService;
	
	@RequestMapping(value = "user/statistic/weight", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementWeight(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurementWeight = measurementService.getAllWeightMeasurement(auth.getName());
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("weight", measurementWeight);
		
		
		return  map;
		
	}
}
