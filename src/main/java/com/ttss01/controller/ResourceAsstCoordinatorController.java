package com.ttss01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttss01.entities.ResourceAsstCoordinator;
import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;
import com.ttss01.services.ResourceAsstCoordinatorService;
import com.ttss01.services.ResourceCoordinatorService;
import com.ttss01.services.ResourceDirectorService;

@RestController
@RequestMapping("/api/resources/asst-coordinator")
public class ResourceAsstCoordinatorController {
	
	
	 @Autowired
	 private ResourceAsstCoordinatorService resourceAsstCoordinatorService;
	 
	 @PostMapping("/create")
	    public ResponseEntity<ResourceAsstCoordinator> createResourceAsstCoordinator(@RequestBody ResourceAsstCoordinator resourceAsstCoordinator) {
	        ResourceAsstCoordinator createResourceAsstCoordinator = resourceAsstCoordinatorService.createResourceAsstCoordinator(resourceAsstCoordinator);
	        return new ResponseEntity<>(createResourceAsstCoordinator, HttpStatus.CREATED);
	    }

	    @GetMapping("/getAll")
	    public ResponseEntity<List<ResourceAsstCoordinator>> getAllResourceAsstCoordinator() {
	        List<ResourceAsstCoordinator> allAsstCoordinators = resourceAsstCoordinatorService.getAllAsstCoordinators();
	        return new ResponseEntity<>(allAsstCoordinators, HttpStatus.OK);
	    }
	 
//	 @PostMapping("/create")
//	    public ResponseEntity<ResourceAsstCoordinator> createResourceCoodinator(@RequestBody ResourceAsstCoordinator resourceAsstCoordinator) {
//	        ResourceAsstCoordinator createdResourceAsstCoodinator = resourceAsstCoordinator.createResourceAsstCoordinator(resourceAsstCoordinator);
//	        return new ResponseEntity<>(createdResourceAsstCoodinator, HttpStatus.CREATED);
//	    }
//
//	    @GetMapping("/getAll")
//	    public ResponseEntity<List<ResourceCoordinator>> getAllResourceCoordinator() {
//	        List<ResourceCoordinator> resourceCoordinator = resourceCoordinatorService.getAllResourceCoordinator();
//	        return new ResponseEntity<>(resourceCoordinator, HttpStatus.OK);
//	    }


//	  //create 
//	    @PostMapping("/create")
//	    public ResponseEntity<ResourceAsstCoordinator> createResourceAsstCoordinator(@RequestBody ResourceAsstCoordinator resourceAsstCoordinator){
//			ResourceAsstCoordinator createResourceAsstCoordinator = resourceAsstCoordinatorService.createResourceAsstCoordinator(resourceAsstCoordinator);
//	    	return new ResponseEntity<ResourceAsstCoordinator>(createResourceAsstCoordinator, HttpStatus.OK);
//	    	
//	    }
//	    //get all
//	    @GetMapping("/getAll")
//	    public ResponseEntity<List<ResourceAsstCoordinator>> getAllResourceAsstCoordinator(){
//	    	List<ResourceAsstCoordinator> allAsstCoordinators = resourceAsstCoordinatorService.getAllAsstCoordinators();
//			return new ResponseEntity<>(allAsstCoordinators,HttpStatus.OK);
//	    }
	    

	
//	
//	@PostMapping("/create")
//	public ResourceDirector createDirector(@RequestBody ResourceDirector resourceDirector) {
//		return directorService.createDirectorForm(resourceDirector);
//		
//	}

}
