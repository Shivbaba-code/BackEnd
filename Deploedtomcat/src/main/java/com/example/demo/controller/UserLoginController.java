package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApiResponse;
import com.example.demo.model.UserLogin;
import com.example.demo.model.UserRegistration;
import com.example.demo.repository.UserLoginRepository;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/v1/")
public class UserLoginController {

	@Autowired
	
	
	private UserLoginRepository userLoginRepository;
	
	 @PostMapping("/login")
		@CrossOrigin(origins = "http://localhost:4200")
	 public ResponseEntity<Object> login(@RequestBody UserLogin user) {
		 
		 //UserLogin user= new UserLogin();
	        user = userLoginRepository.findybyUser(user.getMobileno(),user.getPassword());
	        //System.out.println("user "+user);
//	        if (user.getMobileno().equals(user.getMobileno())) {
//	            return ResponseEntity.ok("Login successful");
//	        } else {
//	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid userId or password");
//	        }
	        
	        try {
		        if (user.getMobileno().equals(user.getMobileno())) {
		        	
		        	UserLogin user_1 = new UserLogin();
		        	user_1.setMobileno(user.getMobileno());
		        	user_1.setPassword(user.getPassword());
		        	//user_1.setLogintime(user.getLogintime());
		        	userLoginRepository.save(user_1);
		        	 ApiResponse response = new ApiResponse("Login successful");
	                return new ResponseEntity<Object>(response,HttpStatus.OK);
	            } else {
	                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	            }
		        } catch(Exception e) {
		        	return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid mobile number or password");
		        }
	    }
	   
}
