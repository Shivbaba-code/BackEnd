package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarksStudent;
import com.example.demo.response.ResultResponse;
import com.example.demo.service.MarksStudentService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MarksStudentController {
	
	@Autowired
	private MarksStudentService marksStudentService;
	
	
//	@GetMapping("/listStudentMarks")
//	public ResultResponse getList() {
//		return marksStudentService.getList();
//	} 
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addStudentMarks")
	
	public ResultResponse save(@RequestBody MarksStudent marksStudent) {
		return marksStudentService.save(marksStudent);
	} 
	
	
	
	@GetMapping("/getMobile/{parmobileno}")
    public ResponseEntity<List<MarksStudent>> getStudentByMobileNumber(@PathVariable String parmobileno) {
        List<MarksStudent> studentMarks = marksStudentService.getStudentByParmobileno(parmobileno);
        
        if (studentMarks != null) {
            return ResponseEntity.ok(studentMarks);
        } else {
        	
        	
            return ResponseEntity.notFound().build();
           
            
        }
    }

	
	
	@DeleteMapping("/deleteMarks/{id}")
	public ResultResponse delete(@PathVariable ("id") Long id) {
		return marksStudentService.delete(id);
	} 
	
}
