package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserLogin;
import com.example.demo.model.UserRegistration;
import com.example.demo.response.ResultResponse;
import com.example.demo.service.PasswordResetService;


@RestController
@RequestMapping("/api/v1/")
public class PasswordResetController {

//	//@Autowired
//	@org.springframework.beans.factory.annotation.Autowired(required=true)
//	private PasswordResetService passwordResetService;
//	
	
	@Autowired
	private PasswordResetService passwordResetService;
	
	@PutMapping("/passwordUpdate")
	public ResultResponse passUpdate(@RequestBody UserRegistration userRegistration) {
		return passwordResetService.passUpdate(userRegistration);
	}
}
