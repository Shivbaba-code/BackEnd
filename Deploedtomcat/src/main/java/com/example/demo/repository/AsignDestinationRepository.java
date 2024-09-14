package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AsignDestination;



@Repository
public interface AsignDestinationRepository  extends JpaRepository<AsignDestination ,Long>{

	//AsignDestination save(List<AsignDestination> asignDestination);
	
}
