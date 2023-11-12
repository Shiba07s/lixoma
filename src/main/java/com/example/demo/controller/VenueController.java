package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.SearchSchedule;
import com.example.demo.entities.Venue;
import com.example.demo.services.VenueService;

@RestController
@RequestMapping("/api")
public class VenueController {
	
	@Autowired
	private VenueService venueservice;
	
	@GetMapping("/search/venue")
	public ResponseEntity<List<Venue>>getTrainingByRefId(@RequestParam String venue_id){
		
		List<Venue> result = venueservice.findByReferencrId(venue_id);
		
		return ResponseEntity.ok(result);
	}
	@GetMapping("/search/venuename")
	public ResponseEntity<List<Venue>>getTrainingByVenueName(@RequestParam String venue_name){
		
		List<Venue> result = venueservice.findByVenueName(venue_name);
		
		return ResponseEntity.ok(result);
	}
    @GetMapping("/names")
    public List<Object[]> getAllVenueNames() {
        return venueservice.getAllVenueNames();
    }
	
	@GetMapping("/venue/list")
	public ResponseEntity<List<Venue>> getAllData(){
		List<Venue> list = venueservice.getAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}
