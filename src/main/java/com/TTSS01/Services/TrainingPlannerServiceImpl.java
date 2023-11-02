package com.TTSS01.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TTSS01.Entity.Trainingplanner;
import com.TTSS01.Repository.TrainingPlannerRepository;
@Service
public class TrainingPlannerServiceImpl implements TrainingPlannerService {
	
	
	@Autowired
	TrainingPlannerRepository TrainingPlannerRepo;

	@Override
	public Trainingplanner createTrainingPlanner(Trainingplanner trainingPlannner) {
		return TrainingPlannerRepo.save(trainingPlannner);
	}

	@Override
	public List<Trainingplanner> getAllTrainingPlannerList() {
		return TrainingPlannerRepo.findAll();
	}

	@Override
	public Trainingplanner updateTraining(Long id, Trainingplanner trainingPlannner) {
	    if (TrainingPlannerRepo.existsById(id)) {
	    	trainingPlannner.setId(id);
            return TrainingPlannerRepo.save(trainingPlannner); 
        } else {
            return null; 
        }
    }

	@Override
	public Trainingplanner archiveTraining(Long id, Trainingplanner trainingPlannner) {
		if (TrainingPlannerRepo.existsById(id)) {
			trainingPlannner.setArchived(true);
			return TrainingPlannerRepo.save(trainingPlannner);	
		}else {
	        return null;

			
		}

	}
}


