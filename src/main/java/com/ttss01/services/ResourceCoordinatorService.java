package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;

public interface ResourceCoordinatorService {
	//ResourceDirector createDirectorForm(ResourceDirector resourceDirector);
	
    ResourceCoordinator createResourceCoordinator(ResourceCoordinator resourceCoordinator);
    List<ResourceCoordinator> getAllResourceCoordinator();

}
