package com.TTSS01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.Organisation_Agency;
import com.TTSS01.Services.*;


@RestController
@RequestMapping("/api/create")
public class OrganisationController {
	
	@Autowired
	OrganisationService OrganisationService;
	
	
	
	@PostMapping("/organisation")
    public ResponseEntity<Organisation_Agency> createOrganisation(@RequestBody Organisation_Agency organisation_Agency) {
    	Organisation_Agency createOrganisation = OrganisationService.createOrganisation(organisation_Agency);
        if (createOrganisation != null) {
            return new ResponseEntity<>(createOrganisation, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
