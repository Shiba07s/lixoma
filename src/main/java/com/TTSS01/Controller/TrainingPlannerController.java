package com.TTSS01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TTSS01.Entity.Trainingplanner;
import com.TTSS01.Services.TrainingPlannerService;

@RestController
@RequestMapping("/api/trining/planner")
public class TrainingPlannerController {
	
	@Autowired
	TrainingPlannerService trainingPlannerService;
	
	
	
	@PostMapping("/create")
	public ResponseEntity<Trainingplanner> createTrainingPlanner(@RequestBody Trainingplanner trainingPlannner){
		Trainingplanner createTrainingPlanner = trainingPlannerService.createTrainingPlanner(trainingPlannner);
		return new ResponseEntity<Trainingplanner>(createTrainingPlanner,HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Trainingplanner>> getAllPlanningList(){
		List<Trainingplanner> list = trainingPlannerService.getAllTrainingPlannerList();
		return new ResponseEntity<List<Trainingplanner>>(list,HttpStatus.OK);

	}

	 @PutMapping("/update/{id}")
	    public ResponseEntity<Trainingplanner> updateTraining(@PathVariable Long id, @RequestBody Trainingplanner trainingPlanner) {
	        Trainingplanner update = trainingPlannerService.updateTraining(id, trainingPlanner);
	        if (update != null) {
	            return new ResponseEntity<>(update, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	 @DeleteMapping("/archive/{id}")
	 public ResponseEntity<Trainingplanner> archiveTrainingPlanner(@PathVariable Long id,@RequestBody Trainingplanner trainingPlanner) {
	    Trainingplanner archiveTraining = trainingPlannerService.archiveTraining(id, trainingPlanner);
	     if (archiveTraining != null) {
	         return new ResponseEntity<>(archiveTraining, HttpStatus.OK);
	     } else {
	         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	     }
	 }
}
