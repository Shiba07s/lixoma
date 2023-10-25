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
@RequestMapping("/api/resources")
public class ResourceDirectorController {
	
	
	 @Autowired
	 private ResourceDirectorService resourceDirectorService;
	 
//	 @Autowired
//	 private ResourceCoordinatorService resourceCoordinatorService;
//	 
//	 @Autowired
//	 private ResourceAsstCoordinatorService resourceAsstCoordinatorService;
         
	 
	 //Director form
	 
	    @PostMapping("/director/create")
	    public ResponseEntity<ResourceDirector> createResourceDirector(@RequestBody ResourceDirector resourceDirector) {
	        ResourceDirector createdResourceDirector = resourceDirectorService.createResourceDirector(resourceDirector);
	        return new ResponseEntity<>(createdResourceDirector, HttpStatus.CREATED);
	    }

	    @GetMapping("/director/getAll")
	    public ResponseEntity<List<ResourceDirector>> getAllResourceDirectors() {
	        List<ResourceDirector> resourceDirectors = resourceDirectorService.getAllResourceDirectors();
	        return new ResponseEntity<>(resourceDirectors, HttpStatus.OK);
	    }
	    
//	    // Co-ordinator form
//	    
//	    @PostMapping("/coordinator/create")
//	    public ResponseEntity<ResourceCoordinator> createResourceCoodinator(@RequestBody ResourceCoordinator resourceCoordinator) {
//	        ResourceCoordinator createdResourceCoodinator = resourceCoordinatorService.createResourceCoordinator(resourceCoordinator);
//	        return new ResponseEntity<>(createdResourceCoodinator, HttpStatus.CREATED);
//	    }
//
//	    @GetMapping("/coordinator/getAll")
//	    public ResponseEntity<List<ResourceCoordinator>> getAllResourceCoordinator() {
//	        List<ResourceCoordinator> resourceCoordinator = resourceCoordinatorService.getAllResourceCoordinator();
//	        return new ResponseEntity<>(resourceCoordinator, HttpStatus.OK);
//	    }
//	    
//	    //Asst. Co-ordinator form
//	    
//	    //create 
//	    @PostMapping("/asst-coordinator/create")
//	    public ResponseEntity<ResourceAsstCoordinator> createResourceAsstCoordinator(@RequestBody ResourceAsstCoordinator resourceAsstCoordinator){
//			ResourceAsstCoordinator createResourceAsstCoordinator = resourceAsstCoordinatorService.createResourceAsstCoordinator(resourceAsstCoordinator);
//	    	return new ResponseEntity<ResourceAsstCoordinator>(createResourceAsstCoordinator, HttpStatus.OK);
//	    	
//	    }
//	    //get all
//	    @GetMapping("/asst-coordinator/getAll")
//	    public ResponseEntity<List<ResourceAsstCoordinator>> getAllResourceAsstCoordinator(){
//	    	List<ResourceAsstCoordinator> allAsstCoordinators = resourceAsstCoordinatorService.getAllAsstCoordinators();
//			return new ResponseEntity<>(allAsstCoordinators,HttpStatus.OK);
//	    }
//	    

	
//	
//	@PostMapping("/create")
//	public ResourceDirector createDirector(@RequestBody ResourceDirector resourceDirector) {
//		return directorService.createDirectorForm(resourceDirector);
//		
//	}

}
