package com.TTSS01.Services;

import java.util.List;

import com.TTSS01.Entity.TrainingCreation;

public interface TrainingCreationService {
	
	TrainingCreation createTraining(TrainingCreation trainingCreation);
	
	List<TrainingCreation> getAllTrainings();
	
	 List<TrainingCreation> findAllTrainingsWithVenues();

}
