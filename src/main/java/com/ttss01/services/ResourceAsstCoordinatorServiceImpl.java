package com.ttss01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss01.entities.ResourceAsstCoordinator;
import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;
import com.ttss01.repositories.ResourceAsstCoordinatorRepository;
import com.ttss01.repositories.ResourceCoordinatorRepository;
import com.ttss01.repositories.ResourceDirectorRepository;

@Service
public class ResourceAsstCoordinatorServiceImpl implements ResourceAsstCoordinatorService {
	
	@Autowired
	private ResourceAsstCoordinatorRepository resourceAsstCoordinatorRepository;

	@Override
	public ResourceAsstCoordinator createResourceAsstCoordinator(ResourceAsstCoordinator resourceAsstCoordinator) {
		return resourceAsstCoordinatorRepository.save(resourceAsstCoordinator);
	}

	@Override
	public List<ResourceAsstCoordinator> getAllAsstCoordinators() {
		return resourceAsstCoordinatorRepository.findAll();
	}
	
	     
 

}
