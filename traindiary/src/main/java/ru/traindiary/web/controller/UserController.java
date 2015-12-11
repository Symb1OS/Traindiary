package ru.traindiary.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ru.traindiary.model.Profile;
import ru.traindiary.model.User;
import ru.traindiary.model.UserRoles;
import ru.traindiary.service.UserService;
import ru.traindiary.utils.PasswordEncoderGenerator;

@Controller
public class UserController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userreg", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> userRegistration(
						@RequestParam(value = "email", required = false) String email,
						@RequestParam(value = "pass", required = false) String password,
						@RequestParam(value = "first", required = false) String firstName,
						@RequestParam(value = "second", required = true) String secondName,
						@RequestParam(value = "last", required = true) String lastName,
						@RequestParam(value = "sex", required = true) int sex,
						@RequestParam(value = "dob", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date birthday){

		boolean userExist = userService.userIsExist(email);
		if(userExist){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("success", false);
			map.put("msg", "Такой пользователь уже зарегистрирован");
			
			return map;
		}else {
		
			User user = new User(email, password);
			
			UserRoles userRoles = new UserRoles();
			userRoles.setUsername(email);
			userRoles.setRole("ROLE_USER");
			
			user.setUserRoles(userRoles);
			
			Profile profile = new Profile(email, lastName, firstName, secondName, sex, birthday, "TODO");
			
			user.setProfile(profile);
			
			logger.info("Регистрация нового пользователя: " + user);
			
			userService.addUser(user);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("success", true);
			map.put("msg", "Поздравляем! Регистрация прошла успешно");
			
			return map;
		}
		
	}
	
	@RequestMapping(value = "/user/updateProfile", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> userUpdate(
						@RequestParam(value = "lastName", required = true) String lastName,
						@RequestParam(value = "firstName", required = false) String firstName,
						@RequestParam(value = "secondName", required = true) String secondName,
						@RequestParam(value = "sex", required = true) int sex,
						@RequestParam(value = "city", required = true) String city,
						@RequestParam(value = "birthday", required = true) @DateTimeFormat(pattern="yyyy-MM-dd") Date birthday){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    
	    User user = userService.getUser(auth.getName());	
	    
	    Profile profile = user.getProfile();
	    profile.setLastName(lastName);
	    profile.setFirstName(firstName);
	    profile.setSecondName(secondName);
	    profile.setSex(sex);
	    profile.setCity(city);
	    profile.setBirthday(birthday);
		
	    userService.updateProfile(profile);
	    
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("msg", "Профиль обновлен");
		
		return map;
	}
	
	@RequestMapping(value = "user/changePassword", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> changePassword(
						@RequestParam(value = "oldPass", required = false) String oldPwd,
						@RequestParam(value = "newPass", required = true) String newPwd){
		
		PasswordEncoderGenerator encoderGenerator = new PasswordEncoderGenerator();
		String oldHashPwd = encoderGenerator.toSha(oldPwd);
				
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    
	    User user = userService.getUser(auth.getName());
		
	    boolean isPassEquals = user.getPassword().equals(oldHashPwd);
	    if(isPassEquals){
	    	user.setShaPassword(newPwd);
	    	userService.changePassword(user);
	    	
	 		Map<String, Object> map = new HashMap<String, Object>();
	 		map.put("success", true);
	 		map.put("msg", "Пароль изменен");
	 		
	 		return map;
	    }else{
	    	
	    	Map<String, Object> map = new HashMap<String, Object>();
	 		map.put("success", false);
	 		map.put("msg", "Неверно указан старый пароль!");
	 		
	 		return map;
	    	
	    }
	
	}
	
	@RequestMapping(value = "user/loadProfile", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> loadProfile(){
		
	try {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    
	    User user = userService.getUser(auth.getName());
		
 		ObjectMapper mapper = new ObjectMapper();
 		
 		Map<String, Object> map = new HashMap<String, Object>();
 		map.put("success", true);
		map.put("msg", "Профиль загружен");
 		map.put("data", mapper.writeValueAsString(user.getProfile()));
 		
 		logger.info(map);
 		
 		return map;
 		
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