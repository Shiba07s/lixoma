package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.SearchSchedule;
import com.example.demo.services.SearchScheduleService;
import com.example.demo.services.VenueService;
 
 
@RestController
@RequestMapping("/api")
public class SearchScheduleController {
	
	@Autowired
	private SearchScheduleService searchScheduleService;
	
	@Autowired
	private VenueService venueService;
	 
	
	@GetMapping("/schedule")
	public ResponseEntity<List<SearchSchedule>>getTrainingByRefId(@RequestParam String ref_planner_id){
		
		List<SearchSchedule> result = searchScheduleService.findByReferencrId(ref_planner_id);
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<SearchSchedule>> getAllData(){
		List<SearchSchedule> list = searchScheduleService.getAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
 
	 
}

