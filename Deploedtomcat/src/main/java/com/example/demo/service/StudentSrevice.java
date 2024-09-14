package com.example.demo.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentSrevice {

	
	 @Autowired
	    private StudentRepository studentResRepository;
	 
	 
	 public List<Student> getStudentByparmobileno(String parmobileno) {
		 
	        return studentResRepository.findByParmobileno(parmobileno);
	    }

//	 
//	 public Student addStudent(StudentDto student) {
//		 
//		 Student student_1 = new Student();
//		 student_1.setStdfirstname(student_1.getStdfirstname());
//		 student_1.setUserProfile(student_1.getUserProfile());
//		 return studentResRepository.save(student_1);
//		 
//	 }
//	 public Student findByParmobileno(String Parmobileno) {
//	        return studentResRepository.findByParmobileno(Parmobileno);
//	    }
	 
	
	 
	 public void  saveProductToDB(MultipartFile file,String Stdfirstname)
		{
		 
		Student std= new Student();
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			std.setUserProfile(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		std.setStdfirstname(Stdfirstname);
		studentResRepository.save(std);
		}
}
