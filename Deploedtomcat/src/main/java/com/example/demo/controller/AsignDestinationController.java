package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AsignDestination;
import com.example.demo.repository.AsignDestinationRepository;

@RestController

@RequestMapping("/api/v1/")
public class AsignDestinationController {

	@Autowired
		 private AsignDestinationRepository asignDestinationRepository;
		 private AsignDestination asignDestination;
		
		 @CrossOrigin(origins = "http://localhost:4200")
			
			@GetMapping("/getAsignDestination")
			public List<AsignDestination> getAllAsignDestination(){
				return asignDestinationRepository.findAll();
				

		 }
		 @CrossOrigin(origins = "http://localhost:4200")
		// @PostMapping(value = "/addAsignDestination", consumes = MediaType.APPLICATION_JSON_VALUE)
		 @PostMapping("/addAsignDestination")
//				public AsignDestination saveDesttination(@RequestBody AsignDestination asignDestination) {
//			 System.out.println("heloo>>>>>>>");
//					System.out.println("values :::::"+ asignDestination.getparent_Name());
//					
//					return asignDestinationRepository.save(asignDestination);
//				}
		 
//		 public ResponseEntity<?> createUsers(@RequestBody List<AsignDestination> asignDestinations) {
//		        // Here you can iterate over the list of AsignDestination objects and save them to the database
//		        // Example:
//		        for (AsignDestination asignDestination : asignDestinations) {
//		        	asignDestinationRepository.save(asignDestination);
//		        }
//		        return ResponseEntity.ok().build();
//		    }
//		 
//		 public ResponseEntity<String> createUsers(@RequestBody List<AsignDestination> asignDestinations) {
//		        // Save all AsignDestination objects to the database
//		        List<AsignDestination> savedAsignDestinations = asignDestinationRepository.saveAll(asignDestinations);
//		        
//		        // Optionally, you can return a response with the IDs of the saved objects
//		        StringBuilder responseMessage = new StringBuilder("Saved AsignDestination IDs: ");
//		        for (AsignDestination asignDestination : savedAsignDestinations) {
//		            responseMessage.append(asignDestination.getId()).append(", ");
//		        }
//		        return ResponseEntity.ok(responseMessage.toString());
//		    }
		 
		 
		 public ResponseEntity<List<Long>> createUsers(@RequestBody List<AsignDestination> asignDestinations) {
		        // Save all AsignDestination objects to the database
		        List<AsignDestination> savedAsignDestinations = asignDestinationRepository.saveAll(asignDestinations);
		        
		        // Extract IDs of the saved AsignDestination objects
		        List<Long> savedIds = savedAsignDestinations.stream()
		                                                     .map(AsignDestination::getId)
		                                                     .collect(Collectors.toList());

		        // Return the IDs as a JSON array
		        return ResponseEntity.ok(savedIds);
		    }
				
				@CrossOrigin(origins = "http://localhost:4200")
				@PutMapping("/updatetaskStatus/{id}")
				public ResponseEntity<AsignDestination> updateTask(@PathVariable Long id, @RequestBody AsignDestination asignDestination) {
					//AsignDestination asignDestination1=asignDestinationRepository.findById(id).orElseThrow(() -> new exception.ResourceNotFoundException("This id not exit :" +id));
					
		AsignDestination asignDestination1=asignDestinationRepository.findById(id).orElseThrow(() -> new com.example.demo.exception.ResourceNotFoundException("This id not exit :" +id));
					asignDestination1.setEmployee_Name(asignDestination.getEmployee_Name());
					asignDestination1.setEmpMobile_no(asignDestination.getEmpMobile_no());
					asignDestination1.setEmpEmail_id(asignDestination.getEmpEmail_id());
					asignDestination1.setEmpDesignation(asignDestination.getEmpDesignation());
					asignDestination1.setAsign_Destination(asignDestination.getAsign_Destination());
					asignDestination1.setWork_Details(asignDestination.getWork_Details());
					asignDestination1.setparent_Name(asignDestination.getparent_Name());
					asignDestination1.setMobileNo(asignDestination.getMobileNo());
					asignDestination1.setVillage_city(asignDestination.getVillage_city());
					asignDestination1.setTal_name(asignDestination.getTal_name());
					asignDestination1.setDistrict(asignDestination.getDistrict());
					asignDestination1.setPostCode(asignDestination.getPostCode());
					asignDestination1.setVisitor_date(asignDestination.getVisitor_date());
					
					asignDestination1.setStatus(asignDestination.getStatus());
					asignDestination1.settimestamp(asignDestination.gettimestamp());
					asignDestination1.setLatitude(asignDestination.getLatitude());
					
					asignDestination1.setLongitude(asignDestination.getLongitude());
					asignDestination1.setReason(asignDestination.getReason());
					AsignDestination updateDetails= asignDestinationRepository.save(asignDestination1);
					return ResponseEntity.ok(updateDetails);
				
				}
				
				
			}
