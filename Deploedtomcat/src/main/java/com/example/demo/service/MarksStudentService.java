package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MarksStudent;
import com.example.demo.repository.MarksStudentRepository;
import com.example.demo.response.MetaDataResponse;
import com.example.demo.response.ResultResponse;
import java.util.List;

@Service
public class MarksStudentService {
	
	
	 @Autowired
	 private MarksStudentRepository marksStudentRepository;
	 
	 public ResultResponse save(MarksStudent marksStudent) {
		 MetaDataResponse metadataResponse = new MetaDataResponse();
			ResultResponse resultResponse = new ResultResponse();
			
			
			try {

				MarksStudent markstudentSave = marksStudentRepository.save(marksStudent);

				metadataResponse.setCode("200K");
				metadataResponse.setMessage("save Student Marks sucessfully..");
				metadataResponse.setNoOfRecords(markstudentSave.getId());
				resultResponse.setMetadata(metadataResponse);
				resultResponse.setResult(markstudentSave);
				return resultResponse;
			} catch (Exception e) {
				e.printStackTrace();
				metadataResponse.setCode("400");
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

				marksStudentRepository.deleteById(id);

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
	 
	 
//	 
//	 public ResultResponse getList() {
//			MetaDataResponse metadataResponse = new MetaDataResponse();
//			ResultResponse resultResponse = new ResultResponse();
//			try {
//				metadataResponse.setCode("200K");
//				metadataResponse.setMessage("Get all records from database");
//				metadataResponse.setNoOfRecords(marksStudentRepository.findAll().size());
//				resultResponse.setMetadata(metadataResponse);
//				resultResponse.setResult(marksStudentRepository.findAll());
//				return resultResponse;
//			} catch (Exception e) {
//				e.printStackTrace();
//				metadataResponse.setCode("400K");
//				metadataResponse.setMessage("Failed to fetch reords");
//				metadataResponse.setNoOfRecords(0);
//				resultResponse.setMetadata(metadataResponse);
//				resultResponse.setResult(null);
//				return resultResponse;
//
//			}
//		}

	 
	 
	 public List<MarksStudent> getStudentByParmobileno(String parmobileno) {
	        return marksStudentRepository.findByParmobileno(parmobileno);
	    }

}
