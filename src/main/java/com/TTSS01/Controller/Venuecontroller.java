package com.TTSS01.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.VenueDetails;
import com.TTSS01.Services.VenueService;


@RestController
@RequestMapping("/api")
public class Venuecontroller {
	
	 @Autowired
	    private VenueService venueService;

	    @PostMapping("/create/venues")
	    public ResponseEntity<VenueDetails> createVenue(@RequestBody VenueDetails venuedetails) {
	        VenueDetails createdVenue = venueService.createVenue(venuedetails);

	        if (createdVenue != null) {
	            return new ResponseEntity<>(createdVenue, HttpStatus.CREATED);
	        } else {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    
	    @GetMapping("/get/venues")
	    public ResponseEntity<List<VenueDetails>>getvenues(){
	    	List<VenueDetails> allVenues = venueService.getAllVenues();
	    	return new ResponseEntity<List<VenueDetails>>(allVenues,HttpStatus.OK);
	    }
	
	}
	
	
	
	


