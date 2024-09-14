package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLogin;
import com.example.demo.model.UserRegistration;
import com.example.demo.repository.PasswordResetRequestRepository;
import com.example.demo.response.MetaDataResponse;
import com.example.demo.response.ResultResponse;

@Service
public class PasswordResetService {

	@Autowired
	//@org.springframework.beans.factory.annotation.Autowired(required=true)
	private PasswordResetRequestRepository passwordResetRequestRepository;
	
	public ResultResponse passUpdate(UserRegistration userRegistration) {
		
		MetaDataResponse metadataResponse = new MetaDataResponse();
		ResultResponse resultResponse = new ResultResponse();
		try {
		UserLogin user=passwordResetRequestRepository.findByMobileno(userRegistration.getMobileno(),userRegistration.getPassword());
		
		System.out.println("mobile::: "+user.getMobileno());
		System.out.println("mobile::: "+user.getPassword());
		
		
		userRegistration.setMobileno(userRegistration.getMobileno());
		userRegistration.setPassword(userRegistration.getPassword());
		passwordResetRequestRepository.save(user);
		
		metadataResponse.setCode("200K");
		metadataResponse.setMessage("paassword update succesfully");
		metadataResponse.setNoOfRecords(1);
		resultResponse.setMetadata(metadataResponse);
		resultResponse.setResult(user);
		return resultResponse;
		
	}catch (Exception e) {
		metadataResponse.setCode("400K");
		metadataResponse.setMessage("failed to update password");
		metadataResponse.setNoOfRecords(0);
		resultResponse.setMetadata(metadataResponse);
		resultResponse.setResult(null);
		return resultResponse;
		}
}
}
