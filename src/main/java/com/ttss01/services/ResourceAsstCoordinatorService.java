package com.ttss01.services;

import java.util.List;

import com.ttss01.entities.ResourceAsstCoordinator;
 
public interface ResourceAsstCoordinatorService {
	
	ResourceAsstCoordinator createResourceAsstCoordinator(ResourceAsstCoordinator resourceAsstCoordinator);
	List<ResourceAsstCoordinator> getAllAsstCoordinators();
	
    
}
