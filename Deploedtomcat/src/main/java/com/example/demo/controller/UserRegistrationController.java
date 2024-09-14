package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.UserRegistration;
import com.example.demo.repository.UserRegistrationRepository;


@RestController
@RequestMapping("/api/v1/")
public class UserRegistrationController {

	
	@Autowired	
	private UserRegistrationRepository userRegistrationRepository;
	
	 @PostMapping("/addUserRegistration")
	    public ResponseEntity<Object> registerUser(@RequestBody UserDTO userDTO) {
	     
//		  if (!userDTO.getPassword().equals(userDTO.getConfirmpassword())) {
//	            return ResponseEntity.badRequest().body("Password and Confirm Password do not match");
//	        }
		 try {
			  if (userRegistrationRepository.findByMobileno(userDTO.getMobileno()) != null) {
		            return ResponseEntity.status(HttpStatus.CONFLICT).body("{message: 'Mobile number already registered'}");
		        }

		        UserRegistration user = new UserRegistration();
		        user.setFirstname(userDTO.getFirstname());
		        user.setLastname(userDTO.getLastname());
		        user.setMobileno(userDTO.getMobileno());
		        user.setPassword(userDTO.getPassword());
		        user.setConfirmpassword(userDTO.getConfirmpassword());
		        user.setEmailid(userDTO.getEmailid());
		        user.setCurrentdate(userDTO.getCurrentdate());
		        userRegistrationRepository.save(user);
		        ApiResponse response = new ApiResponse("User registered successfully");
		        return new ResponseEntity<Object>(response,HttpStatus.OK);
		       // return ResponseEntity.ok("User registered successfully");
		    } 
			catch (Exception e) {
				 return ResponseEntity.badRequest().body("User registration failed");
		 }
	      
	 }
}