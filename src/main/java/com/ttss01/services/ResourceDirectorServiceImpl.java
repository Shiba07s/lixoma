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
public class ResourceDirectorServiceImpl implements ResourceDirectorService {
	
	    @Autowired
	    private ResourceDirectorRepository resourceDirectorRepository;
	    
	    @Autowired
	    private ResourceCoordinatorRepository resourceCoordinatorRepository;
	    
	    @Autowired
		private ResourceAsstCoordinatorRepository resourceAsstCoordinatorRepository;

	 
	  //Course Coordinator services layer

	    @Override
	    public ResourceDirector createResourceDirector(ResourceDirector resourceDirector) {
	        return resourceDirectorRepository.save(resourceDirector);
	    }

	    @Override
	    public List<ResourceDirector> getAllResourceDirectors() {
	        return resourceDirectorRepository.findAll();
	    }
	    
	 /* //Course Coordinator services layer
	    
	    //create coordinator form
	    @Override
		public ResourceCoordinator createResourceCoordinator(ResourceCoordinator resourceCoordinator) {
			return resourceCoordinatorRepository.save(resourceCoordinator);
		}
	    
	    //get all

		@Override
		public List<ResourceCoordinator> getAllResourceCoordinator() {
			return resourceCoordinatorRepository.findAll();
		}
		
		
        //Course Asst. Coordinator services layer
		
		//create
		@Override
		public ResourceAsstCoordinator createResourceAsstCoordinator(ResourceAsstCoordinator resourceAsstCoordinator) {
			return resourceAsstCoordinatorRepository.save(resourceAsstCoordinator);
		}
		
       //get all
		@Override
		public List<ResourceAsstCoordinator> getAllAsstCoordinators() {
			return resourceAsstCoordinatorRepository.findAll();
		}*/
		
}
