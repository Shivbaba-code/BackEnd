package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MarksStudent;
import com.example.demo.model.PaymentHistory;
import com.example.demo.repository.PaymentHistoryRepository;
import com.example.demo.response.MetaDataResponse;
import com.example.demo.response.ResultResponse;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentHistoryRepository paymentHistoryRepository;
	
	
	
	 public ResultResponse save(PaymentHistory paymentHistory) {
		 MetaDataResponse metadataResponse = new MetaDataResponse();
			ResultResponse resultResponse = new ResultResponse();
			
			
			try {

				PaymentHistory paymentHistory2 = paymentHistoryRepository.save(paymentHistory);

				metadataResponse.setCode("200K");
				metadataResponse.setMessage("Save payment sucessfully..");
				metadataResponse.setNoOfRecords(paymentHistory2.getId());
				resultResponse.setMetadata(metadataResponse);
				resultResponse.setResult(paymentHistory2);
				return resultResponse;
			} catch (Exception e) {
				e.printStackTrace();
				metadataResponse.setCode("400");
				metadataResponse.setMessage("Failed to save payment record in database");
				metadataResponse.setNoOfRecords(0);
				resultResponse.setMetadata(metadataResponse);
				resultResponse.setResult(null);
				return resultResponse;

			}
		 
	 }
	 
	 
	 
	 public List<PaymentHistory> getStudentByParmobileno(String parmobileno) {
	        return paymentHistoryRepository.findByParmobileno(parmobileno);
	    }


}
