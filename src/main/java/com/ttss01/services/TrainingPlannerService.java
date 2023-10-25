package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.TrainingPlannner;

public interface TrainingPlannerService {
	TrainingPlannner createTrainingPlanner(TrainingPlannner trainingPlannner);
	
	List<TrainingPlannner> getAllTrainingPlannerList();
	
//	TrainingPlannner getTrainingById(long id);
	
	TrainingPlannner updateTraining(Long id, TrainingPlannner trainingPlan);
	
//	 TrainingPlannner archiveTraining(long id);
//
//	 TrainingPlannner unarchiveTraining(long id);

}
