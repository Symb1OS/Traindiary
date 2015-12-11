package ru.traindiary.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Measurement;
import ru.traindiary.service.UserService;

@Controller
public class MeasurementController {
	
	private static final Logger logger = Logger.getLogger(MeasurementController.class);
	
	@Autowired
	private UserService userService;
 
	@RequestMapping(value = "user/measurement/add")
	public @ResponseBody Map<String, Object> addMeasurement(@RequestBody String data){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			userService.addMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/update")
	public @ResponseBody Map<String, Object> updateMeasurement(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			userService.updateMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurement(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = userService.getAllMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("measurement", measurement);
		
		return map;
		
	}
	
}