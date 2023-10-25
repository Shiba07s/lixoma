package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.ResourceAsstCoordinator;
import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;

public interface ResourceDirectorService {
	//ResourceDirector createDirectorForm(ResourceDirector resourceDirector);
	
    ResourceDirector createResourceDirector(ResourceDirector resourceDirector);
    List<ResourceDirector> getAllResourceDirectors();
    
//    ResourceCoordinator createResourceCoordinator(ResourceCoordinator resourceCoordinator);
//    List<ResourceCoordinator> getAllResourceCoordinator();
//
//    
//    ResourceAsstCoordinator createResourceAsstCoordinator(ResourceAsstCoordinator resourceAsstCoordinator);
//	List<ResourceAsstCoordinator> getAllAsstCoordinators();

}
