package com.TTSS01.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.TrainingCreation;
import com.TTSS01.Repository.TrainingCreationRepository;

@Service
public class TrainingCreationImpl implements TrainingCreationService {
	
	
	@Autowired
	TrainingCreationRepository TrainingCreationRepo;

	@Override
	public TrainingCreation createTraining(TrainingCreation trainingCreation) {
		return TrainingCreationRepo.save(trainingCreation);
	}

	@Override
	public List<TrainingCreation> getAllTrainings() {
		return TrainingCreationRepo.findAll();	
		
	}

	@Override
	public List<TrainingCreation> findAllTrainingsWithVenues() {
		return TrainingCreationRepo.findAllTrainingsWithVenues();
	}

}
