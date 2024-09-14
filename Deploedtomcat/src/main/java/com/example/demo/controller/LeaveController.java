package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Leave;
import com.example.demo.model.Student;
import com.example.demo.repository.LeaveRepository;
import com.example.demo.response.ResultResponse;
import com.example.demo.service.LeaveService;

@RestController
@RequestMapping("/api/v1/")
public class LeaveController {
	
	@Autowired
	private LeaveService leaveService;
	@Autowired
	private LeaveRepository leaveRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	
	
	@GetMapping("/listleave")
	public ResponseEntity<List<Leave>> getAllStudents() {
        List<Leave> studentLeave = leaveRepository.findAll();
        if (studentLeave.isEmpty()) {
        	System.out.println("Data not Found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(studentLeave, HttpStatus.OK);
    }
	
//	@GetMapping("/listleave")
//	public ResultResponse getList() {
//		return leaveService.getList();
//	} 
	

	@PostMapping("/saveLeave")
	public ResultResponse save(@RequestBody Leave leave) {
		return leaveService.save(leave);
	} 
	
	
	@DeleteMapping("/deleteLeaves/{id}")
	public ResultResponse delete(@PathVariable ("id") Long id) {
		return leaveService.delete(id);
	} 

}
