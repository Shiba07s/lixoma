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

import com.ttss01.entities.ResourceCoordinator;
import com.ttss01.entities.ResourceDirector;
import com.ttss01.services.ResourceCoordinatorService;
import com.ttss01.services.ResourceDirectorService;

@RestController
@RequestMapping("/api/resources/coordinator")
public class ResourceCoordinatorController {
	
	
	 @Autowired
	    private ResourceCoordinatorService resourceCoordinatorService;

	    @PostMapping("/create")
	    public ResponseEntity<ResourceCoordinator> createResourceCoodinator(@RequestBody ResourceCoordinator resourceCoordinator) {
	        ResourceCoordinator createdResourceCoodinator = resourceCoordinatorService.createResourceCoordinator(resourceCoordinator);
	        return new ResponseEntity<>(createdResourceCoodinator, HttpStatus.CREATED);
	    }

	    @GetMapping("/getAll")
	    public ResponseEntity<List<ResourceCoordinator>> getAllResourceCoordinator() {
	        List<ResourceCoordinator> resourceCoordinator = resourceCoordinatorService.getAllResourceCoordinator();
	        return new ResponseEntity<>(resourceCoordinator, HttpStatus.OK);
	    }

	
//	
//	@PostMapping("/create")
//	public ResourceDirector createDirector(@RequestBody ResourceDirector resourceDirector) {
//		return directorService.createDirectorForm(resourceDirector);
//		
//	}

}
