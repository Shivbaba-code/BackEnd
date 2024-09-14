package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.MarksStudent;
import java.util.List;
@Repository
public interface MarksStudentRepository extends JpaRepository<MarksStudent, Long> {

	//@Query(value="SELECT * from app_studentmarks_information ud where ud.parmobileno=?1",nativeQuery = true)
//	MarksStudent  findByParmobileno(String parmobileno);
	
	List<MarksStudent> findByParmobileno(String parmobileno);
}
