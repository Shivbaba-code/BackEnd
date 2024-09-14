package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MarksStudent;
import com.example.demo.model.PaymentHistory;
import com.example.demo.response.ResultResponse;
import com.example.demo.service.PaymentService;

@RestController
@RequestMapping("/api/v1/")
public class PaymentHistoryController {

	@Autowired
	
	private PaymentService paymentService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addNextPayment")
	
	public ResultResponse save(@RequestBody PaymentHistory paymentHistory) {
		return paymentService.save(paymentHistory);
	} 
	
	
	@GetMapping("/getPaymentDetails/{parmobileno}")
    public ResponseEntity<List<PaymentHistory>> getStudentByMobileNumber(@PathVariable String parmobileno) {
        List<PaymentHistory> paymentHistoryDetails = paymentService.getStudentByParmobileno(parmobileno);
        
        if (paymentHistoryDetails != null) {
            return ResponseEntity.ok(paymentHistoryDetails);
        } else {
        	
        	
            return ResponseEntity.notFound().build();
           
            
        }
    }
	
}
