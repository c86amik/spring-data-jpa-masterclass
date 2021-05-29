/**
 * 
 */
package com.springcavaj.springjpa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcavaj.springjpa.exception.SpringDataJpaRestException;
import com.springcavaj.springjpa.model.User;
import com.springcavaj.springjpa.repository.SpringDataJpaRestRepository;

/**
 * @author springcavaj
 *
 */
@RestController
public class SpringDataJpaRestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringDataJpaRestController.class);
	
	@Autowired
	private SpringDataJpaRestRepository springDataJpaRestRepository;
	
	@GetMapping("/allUsers")
    public List<User> getAllUserData() {
		LOGGER.info("getAllUserData -> All Data are fetched");
		return springDataJpaRestRepository.findAll();
    }
	
	@PostMapping("/saveUser")
    public User saveUserData(@RequestBody User user) {
        LOGGER.info("saveUserData -> New Record of User saved");
        return springDataJpaRestRepository.save(user);
    }
	
	@PutMapping("/updateUser/{id}")
    public User updateUserData(@PathVariable(value = "id") String id, @RequestBody User user) {
        LOGGER.info("updateUserData -> Update the existing User Record");
        Long userId = Long.parseLong(id);
        User model = springDataJpaRestRepository.findById(userId)
        		.orElseThrow(() -> new SpringDataJpaRestException("User Record not found", id));
        if (null != model && model.getUserId() == user.getUserId()) {
        	return springDataJpaRestRepository.save(user);
		}
        return model;
    }

	@GetMapping("/getUser/{id}")
    public User getUserDataById(@PathVariable(value = "id") String id) {
		Long userId = Long.parseLong(id);
    	User user = springDataJpaRestRepository.findById(userId)
    			.orElseThrow(() -> new SpringDataJpaRestException("User Record not found", id));
    	LOGGER.info("getUserDataById -> Fetch the User Detail by userId as : {}", userId);
        return user;
    }
	
	@GetMapping("/getUserByFirstName/{firstName}")
    public List<User> getUserDataByFirstName(@PathVariable(value = "firstName") String firstName) {
    	List<User> user = springDataJpaRestRepository.findByFirstName(firstName);
    	LOGGER.info("getUserDataByFirstName -> Fetch the User Detail by First Name as : {}", firstName);
        return user;
    }
	
	@GetMapping("/getUserByLastName/{lastName}")
    public List<User> getUserDataByLastName(@PathVariable(value = "lastName") String lastName) {
		List<User> user = springDataJpaRestRepository.findByLastName(lastName);
    	LOGGER.info("getUserDataByLastName -> Fetch the User Detail by Last Name as : {}", lastName);
        return user;
    }
	
	@GetMapping("/getUserByMobileNo/{mobileNo}")
    public List<User> getUserDataByMobileNo(@PathVariable(value = "mobileNo") String mobileNo) {
		List<User> user = springDataJpaRestRepository.findByMobileNo(mobileNo);
    	LOGGER.info("getUserDataByMobileNo -> Fetch the User Detail by Mobile No as : {}", mobileNo);
        return user;
    }
	
	@GetMapping("/getUserByEmail/{email}")
    public List<User> getUserDataByEmail(@PathVariable(value = "email") String email) {
		List<User> user = springDataJpaRestRepository.findByEmail(email);
    	LOGGER.info("getUserDataByEmail -> Fetch the User Detail by Email as : {}", email);
        return user;
    }
	
	@GetMapping("/getUserByPan/{panNo}")
    public User getUserDataByPan(@PathVariable(value = "panNo") String panNo) {
    	User user = springDataJpaRestRepository.findByPanNo(panNo);
    	LOGGER.info("getUserDataByPan -> Fetch the User Detail by PAN No as : {}", panNo);
        return user;
    }
	
	@DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable(value = "id") String id) {
		Long userId = Long.parseLong(id);
		User user = springDataJpaRestRepository.findById(userId)
				.orElseThrow(() -> new SpringDataJpaRestException("User not found", id));
	    springDataJpaRestRepository.delete(user);
    	LOGGER.info("deleteUser -> Delete the User of userId : {}", userId);
    }
	
	@GetMapping("/getUserByName/{firstName}/{lastName}")
    public List<User> getUserByName(@PathVariable(value = "firstName") String firstName, 
    		@PathVariable(value = "lastName") String lastName) {
		List<User> user = springDataJpaRestRepository.findByFirstAndLastName(firstName, lastName);
    	LOGGER.info("getUserByName -> Fetch the User Detail by FirstName and LastName as : {}, {}", firstName, lastName);
        return user;
    }
}
