package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Student;
import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {

	//ResponseEntity<Student> save(String name, MultipartFile file);
	@Query(value="SELECT * from app_student_information ud where ud.parmobileno=?1",nativeQuery = true)
	List<Student> findByParmobileno(String parmobileno);

}
