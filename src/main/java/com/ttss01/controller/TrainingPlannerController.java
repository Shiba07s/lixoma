package com.ttss01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttss01.entities.TrainingPlannner;
import com.ttss01.services.TrainingPlannerService;

@RestController
@RequestMapping("/api/trining/planner")
public class TrainingPlannerController {
	 
	
	@Autowired
	private TrainingPlannerService trainingPlannerService;
	
	@PostMapping("/create")
	public ResponseEntity<TrainingPlannner> createTrainingPlanner(@RequestBody TrainingPlannner trainingPlannner){
		TrainingPlannner createTrainingPlanner = trainingPlannerService.createTrainingPlanner(trainingPlannner);
		return new ResponseEntity<TrainingPlannner>(createTrainingPlanner,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<TrainingPlannner>> getAllPlanningList(){
		List<TrainingPlannner> list = trainingPlannerService.getAllTrainingPlannerList();
		return new ResponseEntity<List<TrainingPlannner>>(list,HttpStatus.OK);
		
	}
	
	 @PutMapping("/update/{id}")
	    public ResponseEntity<TrainingPlannner> updateTraining(@PathVariable Long id, @RequestBody TrainingPlannner trainingPlanner) {
	        TrainingPlannner update = trainingPlannerService.updateTraining(id, trainingPlanner);
	        if (update != null) {
	            return new ResponseEntity<>(update, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	

}
