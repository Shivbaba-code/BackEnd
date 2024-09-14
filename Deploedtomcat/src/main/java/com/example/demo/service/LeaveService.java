package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Leave;
import com.example.demo.repository.LeaveRepository;
import com.example.demo.response.MetaDataResponse;
import com.example.demo.response.ResultResponse;

@Service
public class LeaveService {

	
	@Autowired
	private LeaveRepository leaveRepository;
	
//	public ResultResponse getList() {
//		MetaDataResponse metadataResponse = new MetaDataResponse();
//		ResultResponse resultResponse = new ResultResponse();
//		try {
//			metadataResponse.setCode("200K");
//			metadataResponse.setMessage("Get all records from database");
//			metadataResponse.setNoOfRecords(leaveRepository.findAll().size());
//			resultResponse.setMetadata(metadataResponse);
//			resultResponse.setResult(leaveRepository.findAll());
//			return resultResponse;
//		} catch (Exception e) {
//			e.printStackTrace();
//			metadataResponse.setCode("400K");
//			metadataResponse.setMessage("Failed to fetch reords");
//			metadataResponse.setNoOfRecords(0);
//			resultResponse.setMetadata(metadataResponse);
//			resultResponse.setResult(null);
//			return resultResponse;
//
//		}
//	}
	
	public ResultResponse save(Leave leave) {
		MetaDataResponse metadataResponse = new MetaDataResponse();
		ResultResponse resultResponse = new ResultResponse();
		try {

			Leave studentLeaveSave = leaveRepository.save(leave);

			metadataResponse.setCode("200K");
			metadataResponse.setMessage("save Data sucessfully in database");
			metadataResponse.setNoOfRecords(studentLeaveSave.getId());
			resultResponse.setMetadata(metadataResponse);
			resultResponse.setResult(studentLeaveSave);
			return resultResponse;
		} catch (Exception e) {
			e.printStackTrace();
			metadataResponse.setCode("400K");
			metadataResponse.setMessage("Failed to save records in database");
			metadataResponse.setNoOfRecords(0);
			resultResponse.setMetadata(metadataResponse);
			resultResponse.setResult(null);
			return resultResponse;

		}
	}
	
	
	
	 public ResultResponse delete(Long id) {
			MetaDataResponse metadataResponse = new MetaDataResponse();
			ResultResponse resultResponse = new ResultResponse();
			try {

				leaveRepository.deleteById(id);

				metadataResponse.setCode("200K");
				metadataResponse.setMessage("Delete records sucessfully");
				metadataResponse.setNoOfRecords(1);
				resultResponse.setMetadata(metadataResponse);
				resultResponse.setResult(null);
				return resultResponse;
			} catch (Exception e) {
				e.printStackTrace();
				metadataResponse.setCode("400K");
				metadataResponse.setMessage("fail to delete records from database");
				metadataResponse.setNoOfRecords(0);
				resultResponse.setMetadata(metadataResponse);
				resultResponse.setResult(null);
				return resultResponse;

			}

		}
	
	
}
