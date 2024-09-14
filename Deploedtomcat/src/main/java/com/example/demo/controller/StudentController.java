package com.example.demo.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.zip.Deflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ImageModel;
import com.example.demo.model.MarksStudent;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentSrevice;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/v1/")

public class StudentController {
	
	@Autowired
	private StudentSrevice studentSrevice;
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	
	@GetMapping("/getAllstudent")
	public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> student = studentRepository.findAll();
        if (student.isEmpty()) {
        	System.out.println("Data not Found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
	
	
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addStudent")	
public ResponseEntity<?>  createStudent(@RequestPart(value ="Stdfirstname", required = false) String Stdfirstname,
		@RequestPart(value ="Stdmiddlename", required = false) String Stdmiddlename,
		@RequestPart(value ="Stdlastname", required = false) String Stdlastname,
		@RequestPart(value ="Stdmobileno", required = false) String Stdmobileno,
		@RequestPart(value ="Stdgender", required = false) String Stdgender,
		@RequestPart(value ="City", required = false) String City,
		@RequestPart(value ="postCode", required = false) String postCode,
		@RequestPart(value ="address", required = false) String address,
		@RequestPart(value ="fessAmount", required = false) String fessAmount,
		@RequestPart(value ="feesDate", required = false) String feesDate,
		@RequestPart(value ="pendingfessAmount", required = false) String pendingfessAmount,
		@RequestPart(value ="pendingfeesDate", required = false) String pendingfeesDate,
		@RequestPart(value ="Parfirstname", required = false) String Parfirstname,
		@RequestPart(value ="Parlastname", required = false) String Parlastname,
		@RequestPart(value ="Parmobileno", required = false) String Parmobileno,
		@RequestPart(value ="Emergencynumber", required = false) String Emergencynumber,
		@RequestPart(value ="lastyearclass", required = false) String lastyearclass,
		@RequestPart(value ="lastyearpercentage", required = false) String lastyearpercentage,
		@RequestPart(value ="admissionclass", required = false) String admissionclass,
		@RequestPart(value ="height", required = false) String height,
		@RequestPart(value ="weight", required = false) String weight,
		@RequestPart(value ="bloodgroup", required = false) String bloodgroup,
		@RequestPart(value ="timestamp", required = false) String timestamp,
				
		@RequestParam("userProfile") MultipartFile file) throws IOException{
		
	System.out.println("values ::: "+ Stdfirstname);
	 try {
		Student student = new Student();
		student.setStdfirstname(Stdfirstname);
		student.setStdmiddlename(Stdmiddlename);
		student.setStdlastname(Stdlastname);
		student.setStdmobileno(Stdmobileno);
		
		student.setStdgender(Stdgender);
		student.setCity(City);
		student.setPostCode(postCode);
		student.setAddress(address);
		
		
		student.setFessAmount(fessAmount);
		student.setFeesDate(feesDate);
		student.setPendingfessAmount(pendingfessAmount);
		student.setPendingfeesDate(pendingfeesDate);
		
		student.setParfirstname(Parfirstname);
		student.setParlastname(Parlastname);
		student.setParmobileno(Parmobileno);
		student.setEmergencynumber(Emergencynumber);
		
		student.setLastyearclass(lastyearclass);
		student.setLastyearpercentage(lastyearpercentage);
		student.setAdmissionclass(admissionclass);
		
		
		student.setHeight(height);
		student.setWeight(weight);
		student.setBloodgroup(bloodgroup);
		student.setTimestamp(timestamp);
		
		
		
		student.setUserProfile(file.getBytes());
		studentRepository.save(student);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	  } catch (IOException e) {
          return ResponseEntity.status(500).build();
      }
	}
	
	
	@GetMapping("/getInformationMobile/{parmobileno}")
    public ResponseEntity<List<Student>> getStudentByMobileNumber(@PathVariable String parmobileno) {
        List<Student> studentInformation = studentSrevice.getStudentByparmobileno(parmobileno);
        
        if (studentInformation != null) {
            return ResponseEntity.ok(studentInformation);
        } else {
        	
        	
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
           
            
        }
   }
	
	
//	@ResponseBody
//	public String createProduct(@RequestBody Student product){
//		studentRepository.save(product);
//	    return "OK";
//	}
	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();
	}	
}	
	
	

