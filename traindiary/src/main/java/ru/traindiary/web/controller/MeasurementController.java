package ru.traindiary.web.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Measurement;
import ru.traindiary.service.MeasurementService;

@Controller
public class MeasurementController {
	
	private static final Logger logger = Logger.getLogger(MeasurementController.class);
	
	@Autowired
	private MeasurementService measurementService;
 
	@RequestMapping(value = "user/measurement/weight/add")
	public @ResponseBody Map<String, Object> addMeasurementWeight(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addWeightMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/weight/update")
	public @ResponseBody Map<String, Object> updateMeasurementWeight(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateWeightMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/weight/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementWeight(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurementWeight = measurementService.getAllWeightMeasurement(auth.getName());
		
		logger.info(measurementWeight);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("weight", measurementWeight);
		
		return map;
		
	}
	
	
	@RequestMapping(value = "user/measurement/neck/add")
	public @ResponseBody Map<String, Object> addMeasurementNeck(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addNeckMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/neck/update")
	public @ResponseBody Map<String, Object> updateMeasurementNeck(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateNeckMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/neck/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementNeck(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllNeckMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("neck", measurement);
		
		return map;
		
	}
	
	
	@RequestMapping(value = "user/measurement/chest/add")
	public @ResponseBody Map<String, Object> addMeasurementChest(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addChestMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/chest/update")
	public @ResponseBody Map<String, Object> updateMeasurementChest(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateChestMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/chest/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementChest(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllChestMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("chest", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/waist/add")
	public @ResponseBody Map<String, Object> addMeasurementWaist(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addWaistMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/waist/update")
	public @ResponseBody Map<String, Object> updateMeasurementWaist(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateWaistMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/waist/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementWaist(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllWaistMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("waist", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/buttocks/add")
	public @ResponseBody Map<String, Object> addMeasurementButtocks(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addButtocksMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/buttocks/update")
	public @ResponseBody Map<String, Object> updateMeasurementButtocks(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateButtocksMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/buttocks/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementButtocks(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllButtocksMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("buttocks", measurement);
		
		return map;
		
	}
	
	
	@RequestMapping(value = "user/measurement/hip/add")
	public @ResponseBody Map<String, Object> addMeasurementHip(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addHipMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/hip/update")
	public @ResponseBody Map<String, Object> updateMeasurementHip(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateHipMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/hip/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementHip(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllHipMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("hip", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/caviar/add")
	public @ResponseBody Map<String, Object> addMeasurementCaviar(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addCaviarMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/caviar/update")
	public @ResponseBody Map<String, Object> updateMeasurementCaviar(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateCaviarMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/caviar/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementCaviar(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllCaviarMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("caviar", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/pelvis/add")
	public @ResponseBody Map<String, Object> addMeasurementPelvis(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addPelvisMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/pelvis/update")
	public @ResponseBody Map<String, Object> updateMeasurementPelvis(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updatePelvisMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/pelvis/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementPelvis(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllPelvisMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("pelvis", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/biceps/add")
	public @ResponseBody Map<String, Object> addMeasurementBiceps(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addBicepsMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/biceps/update")
	public @ResponseBody Map<String, Object> updateMeasurementBiceps(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateBicepsMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/biceps/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementBiceps(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllBicepsMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("biceps", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/forearm/add")
	public @ResponseBody Map<String, Object> addMeasurementForearm(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addForearmMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/forearm/update")
	public @ResponseBody Map<String, Object> updateMeasurementForearm(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateForearmMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/forearm/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementForearm(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllForearmMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("forearm", measurement);
		
		return map;
		
	}
	
	@RequestMapping(value = "user/measurement/shoulders/add")
	public @ResponseBody Map<String, Object> addMeasurementShoulders(@RequestBody String data){
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
		
			Measurement measurement = objectMapper.readValue((String)data, Measurement.class);
			measurement.setUsername(auth.getName());
			
			logger.info(measurement);
			
			measurementService.addShouldersMeasurement(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}

		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/shoulders/update")
	public @ResponseBody Map<String, Object> updateMeasurementShoulders(@RequestBody String data){
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			
			Measurement measurement = objectMapper.readValue(data, Measurement.class);
			measurementService.updateShouldersMeasurement(measurement);
			
			logger.info(measurement);
		
		} catch (Exception e) {
			e.printStackTrace();
			map.put("success", false);
		}
	
		map.put("success", true);
		
		return map;
	}
	
	@RequestMapping(value = "user/measurement/shoulders/read", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> readMeasurementShoulders(){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		List<Measurement> measurement = measurementService.getAllShouldersMeasurement(auth.getName());
		
		logger.info(measurement);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("success", true);
		map.put("shoulders", measurement);
		
		return map;
		
	}
}