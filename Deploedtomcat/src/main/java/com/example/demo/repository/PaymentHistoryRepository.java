package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.PaymentHistory;
@Repository
public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory,Long> {

	List<PaymentHistory> findByParmobileno(String parmobileno);
}
