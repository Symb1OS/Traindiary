package ru.traindiary.web.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Measurement;
import ru.traindiary.service.MeasurementService;

@Controller
public class MeasurementController {
	
	private static final Logger logger = Logger.getLogger(MeasurementController.class);
	
	@Autowired
	private MeasurementService measurementService;
 
	@RequestMapping(value = "user/measurement/add")
	public @ResponseBody Map<String, Object> addMeasurementWeight(@RequestBody String data,
					@RequestParam(value = "bodyPartId", required = false) String bodyPartId){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			measurement.setBodyPartId(new BigInteger(bodyPartId));
			
			logger.info(measurement);
			
			measurementService.addMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/update")
	public @ResponseBody Map<String, Object> updateMeasurementWeight(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/delete")
	public @ResponseBody Map<String, Object> deleteMeasurementWeight(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.deleteMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementWeight(
			@RequestParam(value = "bodyPartId", required = false) String bodyPartId){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurementWeight = measurementService.getAllMeasurement(auth.getName(), bodyPartId);
		
		logger.info(measurementWeight);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("measurement", measurementWeight);
		
		return map;
		
	}
	
}