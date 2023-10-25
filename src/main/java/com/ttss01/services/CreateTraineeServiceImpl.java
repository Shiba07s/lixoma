package com.ttss01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss01.entities.CreateTrainee;
import com.ttss01.entities.ResourceDirector;
import com.ttss01.repositories.CreateTraineeRepository;

@Service
public class CreateTraineeServiceImpl implements CreateTraineeService {
	
	@Autowired
	private CreateTraineeRepository createTraineeRepository;

	@Override
	public List<CreateTrainee> getAllTrainees() {
		return createTraineeRepository.findAll();
	}

	@Override
	public CreateTrainee createTraineeForm(CreateTrainee createTrainee) {
		return createTraineeRepository.save(createTrainee);
	}

	 

	 
}
