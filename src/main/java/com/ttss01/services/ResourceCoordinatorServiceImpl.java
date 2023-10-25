package com.ttss01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;
import com.ttss01.repositories.ResourceCoordinatorRepository;
import com.ttss01.repositories.ResourceDirectorRepository;

@Service
public class ResourceCoordinatorServiceImpl implements ResourceCoordinatorService {
	
	    @Autowired
	    private ResourceCoordinatorRepository resourceCoordinatorRepository;

		@Override
		public ResourceCoordinator createResourceCoordinator(ResourceCoordinator resourceCoordinator) {
			return resourceCoordinatorRepository.save(resourceCoordinator);
		}

		@Override
		public List<ResourceCoordinator> getAllResourceCoordinator() {
			return resourceCoordinatorRepository.findAll();
		}
 

}
