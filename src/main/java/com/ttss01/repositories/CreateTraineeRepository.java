package com.ttss01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttss01.entities.CreateTrainee;


public interface CreateTraineeRepository extends JpaRepository<CreateTrainee, Long> {

	//CreateTrainee save(CreateTrainee createTrainee);


}
