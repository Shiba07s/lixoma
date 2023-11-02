package com.TTSS01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.CreateTrainer;
import com.TTSS01.Repository.CreateTrainerRepository;

@Service
public class CreateTrainerServiceImpl implements CreateTrainerService {
	
	@Autowired
	CreateTrainerRepository createTrainerRepo;

	@Override
	public CreateTrainer CreateOneTrainer(CreateTrainer createTrainer) {
		return createTrainerRepo.save(createTrainer);
	}

}
