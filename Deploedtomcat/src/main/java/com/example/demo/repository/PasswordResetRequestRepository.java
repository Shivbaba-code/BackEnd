package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserLogin;
@Repository
public interface PasswordResetRequestRepository extends JpaRepository<UserLogin,Long> {
	
	@Query(value="SELECT * from app_registrationuser_information ud where ud.mobileno=?1",nativeQuery = true)
	UserLogin findByMobileno(String Mobileno,String Password);
}
