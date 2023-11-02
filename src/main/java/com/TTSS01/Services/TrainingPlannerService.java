package com.TTSS01.Services;

import java.util.List;

import com.TTSS01.Entity.Trainingplanner;

public interface TrainingPlannerService {
	
	Trainingplanner createTrainingPlanner(Trainingplanner trainingPlannner);

	List<Trainingplanner> getAllTrainingPlannerList();

	Trainingplanner updateTraining(Long id, Trainingplanner trainingPlannner);
	
	Trainingplanner archiveTraining(Long id,Trainingplanner trainingPlannner);

}
