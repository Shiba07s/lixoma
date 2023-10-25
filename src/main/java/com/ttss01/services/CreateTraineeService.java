package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.CreateTrainee;
import com.ttss01.entities.ResourceAsstCoordinator;
import com.ttss01.entities.ResourceDirector;

public interface CreateTraineeService {
	
	//CreateTrainee createTraineeForm(CreateTrainee createTrainee);
	List<CreateTrainee> getAllTrainees();

	CreateTrainee createTraineeForm(CreateTrainee createTrainee);
	 
//	 ResourceDirector createResourceDirector(ResourceDirector resourceDirector);
//	    List<ResourceDirector> getAllResourceDirectors();

}
