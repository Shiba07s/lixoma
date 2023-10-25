package com.ttss01.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss01.entities.TrainingPlannner;
import com.ttss01.exception.ResourceNotFoundException;
import com.ttss01.repositories.TrainingPlannerRepository;

@Service
public class TrainingPlannerServiceImpl implements TrainingPlannerService {
	
	@Autowired
	private TrainingPlannerRepository trainingPlannerRepository;

	@Override
	public TrainingPlannner createTrainingPlanner(TrainingPlannner trainingPlannner) {
		return trainingPlannerRepository.save(trainingPlannner);
	}

	@Override
	public List<TrainingPlannner> getAllTrainingPlannerList() {
		return trainingPlannerRepository.findAll();
	}
	
	@Override
		public TrainingPlannner updateTraining(Long id, TrainingPlannner trainingPlan) {
		TrainingPlannner update = trainingPlannerRepository.findById(id).orElseThrow(()->  new ResourceNotFoundException("User with given id is not found on server !! : " +id));
			return trainingPlannerRepository.save(update);
		}

	 
//	@Override
//    public TrainingPlannner updateTraining(Long id, TrainingPlannner trainingPlan) {
//        if (trainingPlannerRepository.existsById(id)) {
//            trainingPlan.setId(id);
//            return trainingPlannerRepository.save(trainingPlan); 
//        } else {
//            return null; 
//        }
//    }

//	 @Override
//	    public TrainingPlannner archiveTraining(long id) {
//	        TrainingPlannner training = trainingPlannerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " +id));
//	        training.setArchived(true);
//	        trainingRepository.save(training);
//	    }
//
//	    @Override
//	    public void unarchiveTraining(long id) {
//	        Training training = trainingRepository.findById(id).orElseThrow(() -> new TrainingNotFoundException(id));
//	        training.setArchived(false);
//	        trainingRepository.save(training);
//	    }
//
//		
//		@Override
//		public TrainingPlannner unarchiveTraining(long id) {
//			// TODO Auto-generated method stub
//			return null;
//		}

}
